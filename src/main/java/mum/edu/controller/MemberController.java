package mum.edu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import mum.edu.domain.Member;
import mum.edu.service.MemberService;


/**
 * @author Dane
 *
 */
@Controller
@RequestMapping({"/members"})
@SessionAttributes({"member","memberType"})
public class MemberController {
	
	@Autowired
	private MemberService  memberService;

  	@RequestMapping("/{memberNumber}")
	public String getMemberById(@PathVariable("memberNumber") int memberNumber,Model model) {
		//Member member = memberService.findByMemberNumber(memberNumber);
		//model.addAttribute("member", member);

 		return "member";
	}

	/**
	 * @param memberType
	 * 	getting the role customer or freelancer
	 * @param model
	 * 	putting role to the model
	 * @param memberToBeAdded
	 * getting the model of member
	 * @param result
	 * 	checking for errors
	 * @param request
	 * @return
	 * redirecting to login using PRG
	 */
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String processAddNewMemberForm(Model model, @ModelAttribute("newMember") @Valid Member memberToBeAdded, BindingResult result, HttpServletRequest request) {
	
		System.out.println("Inside Add Member");
		//model.addAttribute("memberType", "ROLE_USER");
		
		if(result.hasErrors()) {
			return "signup";
		}

		memberToBeAdded.getCredentials().setAuthority("ROLE_USER");
		memberToBeAdded.getCredentials().setEnabled(true);
		
		memberService.add(memberToBeAdded);
		
		model.addAttribute("member", memberToBeAdded);

	   	return "redirect:/login";
 
	}
	
 
}
