package com.univlittoral.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projet.dto.AuteurDTO;
import com.univlittoral.projet.dto.HomeDTO;
import com.univlittoral.projet.dto.IndicateursDTO;
import com.univlittoral.projet.dto.LivreDTO;
import com.univlittoral.projet.mapper.AuteurMapper;
import com.univlittoral.projet.mapper.LivreMapper;
import com.univlittoral.projet.service.AuteurService;
import com.univlittoral.projet.service.LivreService;

@RestController
@RequestMapping(value = "/rest/bd/")
public class HomeController {
	@Autowired
	private LivreService service;
	@Autowired
	private AuteurService serviceAuteur;
	
	@GetMapping(value="/home")
	public HomeDTO getHome() {
		IndicateursDTO indicateurs = new IndicateursDTO();

		List<AuteurDTO> listAuteurs = findAuteurs();
		indicateurs.setNbAuteurs(listAuteurs.size());
		
		List<LivreDTO> livres = LivreMapper.map(service.findLivres(), indicateurs);
		
		HomeDTO home = new HomeDTO();
		
		home.setLivres(livres);
		home.setIndicateurs(indicateurs);
		
		return home;
	}
	
	@GetMapping(value="/auteurs/")
	public List<AuteurDTO> findAuteurs(){
		List<AuteurDTO> auteurs = AuteurMapper.map(serviceAuteur.findAuteurs());
		
		return auteurs;
	}
	
	@GetMapping(value="/auteurs/{id}")
	public AuteurDTO findAuteur(@PathVariable long id) {
		return AuteurMapper.map(serviceAuteur.findById(id));
	}
}
