package com.ii02735.springmvcdemo.model;

import java.util.Arrays;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ii02735.springmvcdemo.model.validator.CheckIdentificationNumber;

public class Book {

	@NotNull(message = "L'identité de l''auteur est obligatoire")
	@Size(min = 4, message = "Les informations de l''auteur ne peuvent faire moins de 4 caractères")
	@Pattern(regexp = "^[A-Za-z ]+", message="Caractère non autorisé")
	private String author;
	@NotNull(message = "Le titre du livre est obligatoire")
	@Size(min = 3, message = "Le titre du livre ne peut faire moins de 3 caractères")
	private String title;
	@NotNull(message = "Le genre du livre est obligatoire")
	@Size(min = 4, message = "Le genre du livre ne peut faire moins de 4 caractères")
	private String genre;
	
	@NotNull(message = "Le nombre de pages du livre est obligatoire")
	@Min(value = 3, message = "Le nombre de pages du livre ne peut pas être inférieur à 3")
	private Integer pagesNumber;
	
	@NotNull(message = "Le numéro d'identification du livre est obligatoire")
	@CheckIdentificationNumber
	private String identificationNumber;

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
	
	public void setPagesNumber(Integer pagesNumber) {
		this.pagesNumber = pagesNumber;
	}
	
	public Integer getPagesNumber() {
		return pagesNumber;
	}

	public Map<String, String> getGenres() {
		return Map.of("Policier", "Policier", "Thriller", "Thriller", "Autre", "Autre");
	}

	public Map<String, String> getAvailableSpecifications() {
		return Map.of("Plus de 100 pages", "+100 pages", "Recyclable", "Recyclable", "Échangeable", "Échangeable");
	}
	
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	public String getIdentificationNumber() {
		return this.identificationNumber;
	}
	
	@Override
	public String toString() {
		
		return String.format("{author: %s, title: %s, genre: %s, pagesNumber: %x, specifications: %s}", this.author, this.title, this.genre, this.pagesNumber, Arrays.toString(this.specifications));
	}

}
