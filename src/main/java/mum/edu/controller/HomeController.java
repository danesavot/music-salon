package mum.edu.controller;

import mum.edu.domain.Member;
import mum.edu.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.domain.Member;
import mum.edu.service.MemberService;
  
/**
 * @author Dane
 *
 */
@Controller
public class HomeController {

	@Autowired
	private MemberService memberService;

	/**
	 * @return
	 * return a view to a welcome page
	 */
	@RequestMapping({ "/", "/welcome" })
	public String welcome() {

		return "welcome";
	}

	/**
	 * @param model
	 * Spring model object
	 * @return
	 * return a view to signup page
	 */
	@RequestMapping({ "/signup" })
	public String signup(@ModelAttribute("newMember") Member newMember,Model model) {

//		model.addAttribute("memberType", memberType);
		return "signup";
	}
	/**
	 * @param newMember
	 * getting member
	 * @param memberType
	 * getting from the request role
	 * @param model
	 * save the into the model
	 * @return
	 */
	@RequestMapping({"/signupMember/{memberType}"})
	public String signupMember(@ModelAttribute("newMember") Member newMember, @PathVariable String memberType, Model model) {
		
		model.addAttribute("memberType", memberType);
		
		return "addMember";
	}
	
}
