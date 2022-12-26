package com.univlittoral.projet.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projet.dto.IndicateursDTO;
import com.univlittoral.projet.dto.LivreDTO;
import com.univlittoral.projet.dto.LivreRequestSaveDTO;
import com.univlittoral.projet.entity.LivreEntity;
import com.univlittoral.projet.enums.GenreEnum;

public class LivreMapper {
	public static LivreDTO map(LivreEntity entity) {
		LivreDTO livre = new LivreDTO();
		
		livre.setId(entity.getId());
		livre.setNom(entity.getNom());
		livre.setEditeur(entity.getEditeur());
		livre.setDateParution(entity.getDateParution());
		livre.setLieuParution(entity.getLieuParution());
		livre.setNbPages(entity.getNbPages());
		livre.setGenre(entity.getGenre());
		
		return livre;
	}
	
	public static List<LivreDTO> map(List<LivreEntity> entities) {
		if(null == entities) {
			return null;
		}
		List<LivreDTO> result = new ArrayList<LivreDTO>();
		for(final LivreEntity livre : entities) {
			result.add(LivreMapper.map(livre));
		}
		
		return result;
	}
	
	public static List<LivreDTO> map(List<LivreEntity> entities, IndicateursDTO indicateurs) {
		if(null == entities) {
			return null;
		}
		List<LivreDTO> result = new ArrayList<LivreDTO>();
		final List<GenreEnum> genres = new ArrayList<GenreEnum>();
		for(final LivreEntity livre : entities) {
			if(!genres.contains(livre.getGenre())) {
				genres.add(livre.getGenre());
			}
			result.add(LivreMapper.map(livre));
		}
		
		
		indicateurs.setNbGenres(genres.size());
		indicateurs.setNbLivres(entities.size());
		
		return result;
	}
	
	public static LivreEntity map(LivreRequestSaveDTO request) {		
		LivreEntity livre = new LivreEntity();
		
		livre.setId(request.getId());
		livre.setNom(request.getNom());
		livre.setEditeur(request.getEditeur());
		livre.setDateParution(request.getDateParution());
		livre.setLieuParution(request.getLieuParution());
		livre.setNbPages(request.getNbPages());
		livre.setGenre(request.getGenre());
		livre.setAuteur(request.getAuteur());
		
		return livre;
	}
	
	public static LivreEntity map(long id,LivreRequestSaveDTO entity) {
		LivreEntity livre = new LivreEntity();
		
		livre.setId(entity.getId());
		livre.setNom(entity.getNom());
		livre.setEditeur(entity.getEditeur());
		livre.setDateParution(entity.getDateParution());
		livre.setLieuParution(entity.getLieuParution());
		livre.setNbPages(entity.getNbPages());
		livre.setGenre(entity.getGenre());
		livre.setAuteur(entity.getAuteur());
		
		return livre;
	}
}
