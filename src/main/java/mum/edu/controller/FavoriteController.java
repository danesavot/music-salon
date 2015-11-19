package mum.edu.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import mum.edu.service.MemberService;
import mum.edu.service.MusicService;

@Controller
@SessionAttributes({ "member", "memberType" })
public class FavoriteController {

	private ILogger logger=new Logger();
	
	@Autowired
	private MusicService musicService;

	@Autowired
	private FavoriteService favoriteService;
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/addFavorite/{id}", method = RequestMethod.GET)
	public String addFavorite(@PathVariable Long id,
			HttpSession session,Model model,HttpServletRequest request) {
		Member member=null;
		
		 Principal principal = request.getUserPrincipal();
		 
		 List<Member> members=new ArrayList<>();
		 members=memberService.getAll();
		 
		 for (Member member2 : members) {
			if((member2.getCredentials().getUsername()).equals(principal.getName())){
				member=member2;
			}
		}
		if(member.getFavorite()==null){
			Favorite favorit = new Favorite("Default Favorite", member);
			favoriteService.addFavorite(favorit);
			member.setFavorite(favorit);
			
		}
		else{
		member.getFavorite().setMember(member);
		member.getFavorite().addMusic(musicService.getMusic(id));
		
		favoriteService.addFavorite(member.getFavorite());
		}
		return "redirect:/music";

	}

	
	@RequestMapping(value = "/favorite", method = RequestMethod.GET)
	public String getFavoriteList(Model model,HttpServletRequest request) {
		
		Member member=null;
		
		 Principal principal = request.getUserPrincipal();
		 
		 List<Member> members=new ArrayList<>();
		 members=memberService.getAll();
		 
		 for (Member member2 : members) {
			if((member2.getCredentials().getUsername()).equals(principal.getName())){
				member=member2;
			}
		}
		
		model.addAttribute("favoriteList", favoriteService.getFavorites(member.getId()));
		return "favoriteList";
	}

}
