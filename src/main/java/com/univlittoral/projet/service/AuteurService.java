package com.univlittoral.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projet.entity.AuteurEntity;
import com.univlittoral.projet.repository.AuteurRepository;

@Service
public class AuteurService {
	@Autowired
	private AuteurRepository repo;
	
	public List<AuteurEntity> findAuteurs(){
		return repo.findAll();
	}
	
	public AuteurEntity findById(long id) {
		return repo.findById(id).orElse(null);
	}
}
