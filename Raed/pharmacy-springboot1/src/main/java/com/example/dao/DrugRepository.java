package com.example.dao;

 
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Drugs;

public interface DrugRepository extends JpaRepository<Drugs, Long> {

	@Query("select p from Drugs where p.name like:x")
	public Page<Drugs> search(@Param("x") String sc, Pageable pageable);

	public void delete(Long id);
}
