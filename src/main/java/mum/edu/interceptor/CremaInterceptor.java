package mum.edu.interceptor;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class CremaInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
	String userMessage = "Crema - feel the spring!";
 
		Principal principal = request.getUserPrincipal();

		if (principal != null) {
			if (request.isUserInRole("freelancer") )
				userMessage = "Enjoy the Crema and don't forget Time management";
			else 
				userMessage = "Crema will help you solw your problems";
 	}
	
//		System.out.println("Calling postHandle");
//		modelAndView.getModelMap().addAttribute("SpecialBlurb", userMessage);
 
		return;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
//		System.out.println("Calling afterCompletion");
		return;
	}

}
