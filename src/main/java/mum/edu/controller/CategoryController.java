package mum.edu.controller;

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
import org.springframework.web.servlet.ModelAndView;

import mum.edu.domain.Category;
import mum.edu.service.CategoryService;

@Controller
//@RequestMapping(value="/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("category", categoryService.getCategoryList());
		return "category";
	}

	@RequestMapping(value="/addCategory", method=RequestMethod.GET)
	public String addCategory(@ModelAttribute("category") Category category) {
		return "addCategory";
	}
	
	@RequestMapping(value="/category", method=RequestMethod.POST)
	public String add(@Valid Category category, BindingResult result) {
		String view = "redirect:/category";
		if (!result.hasErrors()){
			categoryService.addNewCategory(category);
		}
		else{
			view = "addCategory";
		}
		return view;
	}

	@RequestMapping(value="/category/{id}", method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		model.addAttribute("category", categoryService.getCategory(id));
		return "categoryDetail";
	}
	
	@RequestMapping(value="/category/{id}", method=RequestMethod.POST)
	public String update(Category category, @PathVariable int id) {
		categoryService.updateCategory(category); // category.id already set by binding
		return "redirect:/category";
	}
	
	@RequestMapping(value="/category/delete", method=RequestMethod.POST)
	public String delete(Category category) {
		categoryService.deleteCategory(category);
		return "redirect:/category";
	}

	@ExceptionHandler(value=ControllerException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("categoryException");
		return mv;
	}
}
