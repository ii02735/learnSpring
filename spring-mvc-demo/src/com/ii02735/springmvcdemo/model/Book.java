package com.ii02735.springmvcdemo.model;

import java.util.Map;

public class Book {

	private String author, title, genre;
	
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public Map<String, String> getGenres()
	{
		return Map.of("Policier", "Policier", "Thriller", "Thriller");
	}
}
