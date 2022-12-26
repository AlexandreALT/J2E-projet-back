package com.univlittoral.projet.dto;

import java.util.List;

public class HomeDTO {
	public List<LivreDTO> livres;
	public IndicateursDTO indicateurs;
	
	public List<LivreDTO> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreDTO> livres) {
		this.livres = livres;
	}
	public IndicateursDTO getIndicateurs() {
		return indicateurs;
	}
	public void setIndicateurs(IndicateursDTO indicateurs) {
		this.indicateurs = indicateurs;
	}
}
