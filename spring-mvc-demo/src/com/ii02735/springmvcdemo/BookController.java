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
	
	@GetMapping("/borrow")
	public String borrowBook(Model model)
	{
		model.addAttribute("book", new Book());
		return "book/borrow-book-form";
	}
	
	@InitBinder
	public void cleanWhitespaces(WebDataBinder binder)
	{
		// Transformer les espaces blancs en valeurs null (true passé à StringTrimmerEditor)
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@PostMapping("/borrow")
	public String borrowBook(@Valid @ModelAttribute("book") Book book, BindingResult result)
	{
		System.out.println(result.hasErrors());
		if(result.hasErrors()) return "book/borrow-book-form";
		return "book/borrow-book-submit";
	}
}
