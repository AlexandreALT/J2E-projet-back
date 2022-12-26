package com.univlittoral.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projet.entity.LivreEntity;
import com.univlittoral.projet.enums.GenreEnum;
import com.univlittoral.projet.repository.LivreRepository;

@Service
public class LivreService {
	@Autowired
	private LivreRepository repo;
	
	public List<LivreEntity> findLivres(){
		return repo.findAll();
	}
	
	public LivreEntity findById(long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void deleteById(long id) {
		repo.deleteById(id);
	}

	public List<LivreEntity> findLivreByGenre(GenreEnum genre) {
		return repo.findLivreByGenre(genre);
	}
	
	public void save(LivreEntity entity) {
		repo.save(entity);
	}
}
