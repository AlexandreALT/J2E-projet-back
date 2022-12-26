package com.univlittoral.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projet.dto.LivreDTO;
import com.univlittoral.projet.dto.LivreRequestSaveDTO;
import com.univlittoral.projet.enums.GenreEnum;
import com.univlittoral.projet.mapper.LivreMapper;
import com.univlittoral.projet.service.LivreService;

@RestController
@RequestMapping(value = "/rest/bd/livres")
public class LivreController {
	@Autowired
	private LivreService service;
	
	@GetMapping(value="{id}")
	public LivreDTO findLivre(@PathVariable long id) {
		return LivreMapper.map(service.findById(id));
	}
	
	@GetMapping
	public List<LivreDTO> findByType(@RequestParam GenreEnum genre) {
		if(genre != null) return LivreMapper.map(service.findLivreByGenre(genre));
		else return LivreMapper.map(service.findLivres());
	}
	
	@DeleteMapping(value="{id}")
	public void deleteLivre(@PathVariable long id) {
		service.deleteById(id);
	}
	
	@PostMapping
	public void addLivre(@RequestBody LivreRequestSaveDTO request) {
		service.save(LivreMapper.map(request));
	}
	
	@PutMapping(value="{id}")
	public void updateLivre(@PathVariable long id,@RequestBody LivreRequestSaveDTO request) {
		service.save(LivreMapper.map(id,request));
	}
}
