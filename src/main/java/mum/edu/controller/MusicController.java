package mum.edu.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.domain.Music;
import mum.edu.service.AlbumService;
import mum.edu.service.CategoryService;
import mum.edu.service.MusicService;

@Controller
//@RequestMapping(value="/music")
public class MusicController {

	@Autowired
	private MusicService musicService;
	
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/music", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("musicList", musicService.getAll());
		return "musicList";
	}

	@RequestMapping(value="/addMusic", method=RequestMethod.GET)
	public String addMusic(@ModelAttribute("music") Music music, Model model) {
		//model.addAttribute("albumList", albumService.getAlbumList());
		model.addAttribute("categoryList", categoryService.getCategoryList());
		return "addMusic";
	}
	
	@RequestMapping(value="/music", method=RequestMethod.POST)
	public @ResponseBody String add(@Valid Music music, BindingResult result,
            @RequestParam("file") MultipartFile file) {
		String view = "redirect:/music";
		if (!result.hasErrors()){
			File f = uploadFileHandler(music.getTitle(), file);
			music.setFile(f);
			musicService.addNewMusic(music);
		}
		else{
			view = "addMusic";
		}
		return view;
	}

	@RequestMapping(value="/music/{id}", method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		model.addAttribute("music", musicService.getMusic(id));
		return "musicDetail";
	}
	
	@RequestMapping(value="/music/{id}", method=RequestMethod.POST)
	public String update(Music music, @PathVariable int id) {
		musicService.updateMusic(music); // music.id already set by binding
		return "redirect:/music";
	}
	
	@RequestMapping(value="/music/delete", method=RequestMethod.POST)
	public String delete(int musicId) {
		musicService.deleteMusic(musicId);
		return "redirect:/music";
	}
	
	/**
     * Upload single file using Spring Controller
     * https://spring.io/guides/gs/uploading-files/
     * 
     * http://www.journaldev.com/2573/spring-mvc-file-upload-example-tutorial-single-and-multiple-files
     */
    private File uploadFileHandler(String name, MultipartFile file) {
 
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
 
                // Creating the directory to store file
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                    dir.mkdirs();
 
                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
                
                return serverFile;
            } catch (Exception e) {
                System.out.println("You failed to upload " + name + " => " + e.getMessage());
            }
        } else {
        	System.out.println( "You failed to upload " + name
                    + " because the file was empty." );
        }
		return null;
    }
 

	@ExceptionHandler(value=ControllerException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("musicException");
		return mv;
	}
}
