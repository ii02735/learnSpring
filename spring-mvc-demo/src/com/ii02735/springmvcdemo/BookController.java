package com.ii02735.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ii02735.springmvcdemo.model.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/borrow")
	public String borrowBook(Model model)
	{
		model.addAttribute("book", new Book());
		return "book/borrow-book-form";
	}
	
	@PostMapping("/borrow")
	public String borrowBook(@ModelAttribute("book") Book book)
	{
		return "book/borrow-book-submit";
	}
}
