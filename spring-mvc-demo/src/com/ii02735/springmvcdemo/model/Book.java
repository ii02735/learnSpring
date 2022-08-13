package com.ii02735.springmvcdemo.model;

import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {

	@NotNull(message = "L'identité de l''auteur est obligatoire")
	@Size(min = 4, message = "Les informations de l''auteur ne peuvent faire moins de 4 caractères")
	private String author;
	@NotNull(message = "Le titre du livre est obligatoire")
	@Size(min = 3, message = "Le titre du livre ne peut faire moins de 3 caractères")
	private String title;
	@NotNull(message = "Le genre du livre est obligatoire")
	@Size(min = 4, message = "Le genre du livre ne peut faire moins de 4 caractères")
	private String genre;

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

	public Map<String, String> getGenres() {
		return Map.of("Policier", "Policier", "Thriller", "Thriller");
	}

	public Map<String, String> getAvailableSpecifications() {
		return Map.of("Plus de 100 pages", "+100 pages", "Recyclable", "Recyclable", "Échangeable", "Échangeable");
	}

}
