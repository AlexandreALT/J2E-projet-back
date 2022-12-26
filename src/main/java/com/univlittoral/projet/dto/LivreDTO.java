package com.univlittoral.projet.dto;

import java.sql.Date;

import com.univlittoral.projet.enums.GenreEnum;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class LivreDTO {
	public long id;
	public String nom;
	public String editeur;
	public Date dateParution;
	public String lieuParution;
	public int nbPages;
	@Enumerated(EnumType.STRING)
	public GenreEnum genre;
	public String auteur;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public Date getDateParution() {
		return dateParution;
	}
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}
	public String getLieuParution() {
		return lieuParution;
	}
	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	public GenreEnum getGenre() {
		return genre;
	}
	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
