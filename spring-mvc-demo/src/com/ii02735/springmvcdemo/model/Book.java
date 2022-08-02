package com.ii02735.springmvcdemo.model;

import java.util.Map;

public class Book {

	private String author, title, genre;
	private String[] specifications;
	
	
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
	
	public void setSpecifications(String[] specifications) {
		this.specifications = specifications;
	}
	
	public String[] getSpecifications() {
		return specifications;
	}


	public Map<String, String> getGenres()
	{
		return Map.of("Policier", "Policier", "Thriller", "Thriller");
	}
	
	public Map<String, String> getAvailableSpecifications()
	{
		return Map.of("Plus de 100 pages", "+100 pages", "Recyclable", "Recyclable", "Échangeable", "Échangeable");
	}
	
	
}
