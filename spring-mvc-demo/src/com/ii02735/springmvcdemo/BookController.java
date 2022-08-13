package com.ii02735.springmvcdemo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ii02735.springmvcdemo.model.Book;

import javax.validation.Valid;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/create")
	public String createBook(Model model)
	{
		model.addAttribute("book", new Book());
		return "book/create-book-form";
	}
	
	@InitBinder
	public void cleanWhitespaces(WebDataBinder binder)
	{
		// Transformer les espaces blancs en valeurs null (true passé à StringTrimmerEditor)
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@PostMapping("/create")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result)
	{
		System.out.println(result.hasErrors());
		System.out.println(book);
		if(result.hasErrors()) {
			System.out.println(result);
			return "book/create-book-form";
		}
		return "book/create-book-submit";
	}
}
