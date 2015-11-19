package mum.edu.controller;

import java.io.File;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import mum.edu.domain.Album;
import mum.edu.service.AlbumService;

@Controller
@RequestMapping("/albums")
public class AlbumController {

	@Value("${server.upload.album.path}")
	private String albumPath;
	@Autowired
	AlbumService albumService;

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newAlbum(Model model, @ModelAttribute("newAlbum") Album album) {

		return "newAlbum";
	}

	@RequestMapping(value = { "/", "" }, method = RequestMethod.POST)
	public String addAlbum(Model model, @ModelAttribute("newAlbum") @Valid Album album, BindingResult result,
			HttpServletRequest request) {

		MultipartFile photo = album.getPhoto();

		if (result.hasErrors()) {
			model.addAttribute("error", "true");
			return "newAlbum";
		}

		albumService.addNewAlbum(album);

		if (photo != null && !photo.isEmpty()) {
			try {
				// photo.transferTo(new
				// File(request.getSession().getServletContext().getRealPath("/resources/images/")
				// +album.getId() + ".png"));
				photo.transferTo(new File(albumPath.concat(album.getId() + ".png")));
			} catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
			}
		}

		return "redirect:/albums";
	}

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String getAlbums(Model model) {

		Set<Album> albums = albumService.getAlbumList();
		model.addAttribute("albums", albums);

		return "albums";
	}

}
