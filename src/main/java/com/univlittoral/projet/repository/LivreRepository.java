package com.univlittoral.projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.projet.entity.LivreEntity;
import com.univlittoral.projet.enums.GenreEnum;

@Repository
public interface LivreRepository extends JpaRepository<LivreEntity, Long>{

	@Query(value="select l from LivreEntity l where genre = :genre")
	List<LivreEntity> findLivreByGenre(@Param("genre") GenreEnum genre);

}
