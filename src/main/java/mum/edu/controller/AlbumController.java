package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.domain.Album;
import mum.edu.service.AlbumService;

@Controller
@RequestMapping("/albums")
public class AlbumController {
	@Autowired
	AlbumService albumService;
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newAlbum(Model model, @ModelAttribute("newAlbum") Album album) {
		
		return "newAlbum";
	}

	@RequestMapping(value = { "/", "" }, method = RequestMethod.POST)
	public String addAlbum(Model model, @ModelAttribute("newAlbum") @Valid Album album, BindingResult result) {
		
		
		if(result.hasErrors()) {
			model.addAttribute("error", "true");
			return "newAlbum";
		}

		
		albumService.addNewAlbum(album);
		
		return "redirect:/albums";
	}
	

	
	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String getAlbums(Model model) {
		
		return "albums";
	}
	

}
