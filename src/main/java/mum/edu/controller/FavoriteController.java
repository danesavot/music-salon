package mum.edu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import mum.edu.domain.Favorite;
import mum.edu.domain.Member;
import mum.edu.logging.ILogger;
import mum.edu.logging.Logger;
import mum.edu.service.FavoriteService;
import mum.edu.service.MusicService;

@Controller
@SessionAttributes({ "member", "memberType" })
public class FavoriteController {

	private ILogger logger=new Logger();
	
	@Autowired
	private MusicService musicService;

	@Autowired
	private FavoriteService favoriteService;

	@RequestMapping(value = "/addFavorite/{id}", method = RequestMethod.GET)
	public void addFavorite(@ModelAttribute("favorite") Favorite favorite, @PathVariable Long id,
			HttpSession session,Model model) {
		Member member = (Member) session.getAttribute("member");
		favorite.setMember(member);
		favorite.addMusic(musicService.getMusic(id));
		logger.log("inside addFavorite");
		
		favoriteService.addFavorite(favorite);

	}

	
	@RequestMapping(value = "/favorite/{id}", method = RequestMethod.GET)
	public String getFavoriteList(@PathVariable int id,Model model) {
		model.addAttribute("favoriteList", favoriteService.getFavorites(id));
		return "favoriteList";
	}

}
