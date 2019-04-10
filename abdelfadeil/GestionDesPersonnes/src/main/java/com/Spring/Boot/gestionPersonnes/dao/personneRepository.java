package com.Spring.Boot.gestionPersonnes.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import com.Spring.Boot.gestionPersonnes.entities.Personne;


public interface personneRepository extends JpaRepository<Personne, Long>{
	
	@Query("select p from Personne p where p.nom like :x")
	public Page<Personne> chercherParNom(@Param("x")String mc, Pageable pageable);

}
