package com.univlittoral.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univlittoral.projet.entity.AuteurEntity;

@Repository
public interface AuteurRepository extends JpaRepository<AuteurEntity, Long>{

}
