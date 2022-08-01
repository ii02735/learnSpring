package com.ii02735.springmvcdemo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String getPage()
	{
		return "main";
	}
	
	@RequestMapping("/form")
	public String showForm()
	{
		return "form";
	}
	
	@RequestMapping(path = "/submit-get") // par défaut à GET
	public String submitGet(HttpServletRequest request)
	{
		System.out.println(request.getParameter("name"));
		return "submit-get";
	}
	
	@PostMapping("/submit-post") // Ou @RequestMapping(path = "/submit-post", method = RequestMethod.POST)
	public String submitPost(HttpServletRequest request, Model model)
	{
		String _firstname = request.getParameter("firstname");
		String _lastname = request.getParameter("lastname");
		
		_lastname = _lastname.toUpperCase();
		
		model.addAllAttributes(Map.of("firstname", _firstname, "lastname", _lastname));
		
		/**
		 * OU
		 * model.addAttribute("firstname", _firstname);
		 * model.addAttribute("lastname", _lastname);
		 */
		
		return "submit-post";
	}
	
	
}
