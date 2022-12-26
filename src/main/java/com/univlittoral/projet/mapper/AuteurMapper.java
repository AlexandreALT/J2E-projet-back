package com.univlittoral.projet.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projet.dto.AuteurDTO;
import com.univlittoral.projet.entity.AuteurEntity;

public class AuteurMapper {
	public static AuteurDTO map(AuteurEntity entity) {
		AuteurDTO auteur = new AuteurDTO();
		
		auteur.setId(entity.getId());
		auteur.setNom(entity.getNom());
		auteur.setPrenom(entity.getPrenom());
		auteur.setDateNaissance(entity.getDateNaissance());
		
		return auteur;
	}
	
	public static List<AuteurDTO> map(List<AuteurEntity> entities) {
		if(null == entities) {
			return null;
		}
		List<AuteurDTO> result = new ArrayList<AuteurDTO>();
		for(final AuteurEntity auteur : entities) {
			result.add(AuteurMapper.map(auteur));
		}
		
		return result;
	}
}
