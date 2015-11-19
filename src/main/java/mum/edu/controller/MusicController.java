package mum.edu.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.domain.Album;
import mum.edu.domain.Category;
import mum.edu.domain.Music;
import mum.edu.service.AlbumService;
import mum.edu.service.CategoryService;
import mum.edu.service.MusicService;

@Controller
@RequestMapping(value="/music")
public class MusicController {

	@Autowired
	private MusicService musicService;
	
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value={ "/", "" }, method=RequestMethod.GET)
	public String getAll(Model model, @RequestParam(value="album", required = false) Long albumID) {
	
		List<Music> musics = new ArrayList<>();
		
		if (albumID == null) {
			musics = musicService.getAll();
		}else {
			musics= musicService.getMusicList(albumID);
		}
		
		model.addAttribute("musicList",musics);
		
		return "musicList";
	}

	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String addMusic(@ModelAttribute("music") Music music, Model model) {
		model.addAttribute("albumList", albumService.getAlbumList());
		model.addAttribute("categoryList", categoryService.getCategoryList());
		return "addMusic";
	}
	
	@RequestMapping(value={ "/", "" }, method=RequestMethod.POST)
	public String add(Model model, @ModelAttribute("music") @Valid Music music, BindingResult result) {
		String view = "redirect:/music";
		if (!result.hasErrors()){
			MultipartFile file = music.getFile();
			uploadFileHandler(music.getTitle(), file);
			music.setFileName(file.getOriginalFilename());
			Album album = albumService.getAlbum(music.getAlbum().getId());
			Set<Category> categoryList = new HashSet<Category>();
			Set<Category> postCategories = music.getCategoryList();
			for (Category category : postCategories){
				categoryList.add(categoryService.getCategory(Integer.parseInt(category.getName())));
			}
			music.setAlbum(album);
			music.setCategoryList(categoryList);
			musicService.addNewMusic(music);
		}
		else{
		    view = "addMusic";
		}
		return view;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		model.addAttribute("music", musicService.getMusic(id));
		return "musicDetail";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public String update(Music music, @PathVariable int id) {
		//musicService.updateMusic(music); // music.id already set by binding
		return "redirect:/music";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(Music music) {
		musicService.deleteMusic(music);
		return "redirect:/music";
	}
	
	/**
     * Upload single file using Spring Controller
     * https://spring.io/guides/gs/uploading-files/
     * 
     * http://www.journaldev.com/2573/spring-mvc-file-upload-example-tutorial-single-and-multiple-files
     */
    private String uploadFileHandler(String name, MultipartFile file) {
 
        if (!file.isEmpty()) {
            try {
 
                // Creating the directory to store file
                String rootPath = System.getProperty("user.dir");
                File dir = new File(rootPath + File.separator);
                if (!dir.exists())
                    dir.mkdirs();
 
                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + file.getOriginalFilename());
                
                file.transferTo(serverFile);

                return serverFile.getPath() + "/" + name;
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
        	return "You failed to upload " + name
                    + " because the file was empty." ;
        }
    }
 

	@ExceptionHandler(value=ControllerException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("musicException");
		return mv;
	}
}
