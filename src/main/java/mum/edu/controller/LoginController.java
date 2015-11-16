package mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Dane
 *
 */
@Controller
public class LoginController {

	/**
	 * @return
	 * return a view to a login page
	 */
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
 		return "login";
	}
 
	/**
	 * @param model
	 * putting to model error
	 * @return
	 */
	/**
	 * @param model
	 * Spring model object
	 * @return
	 * return a view to a login error page
	 */
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	/**
	 * @param model
	 * ending session
	 * @return
	 * return a view to a logout page
	 */
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "redirect:/welcome";
 	}
}
