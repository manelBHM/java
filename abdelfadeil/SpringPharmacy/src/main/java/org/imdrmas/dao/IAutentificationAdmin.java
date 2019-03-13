package org.imdrmas.dao;

import org.imdrmas.users.Adminstrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAutentificationAdmin extends JpaRepository<Adminstrateur, Long>{
	@Query("select a from Adminstrateur a where a.email like :x")
	public Adminstrateur findByEmail(@Param("x")String email);


}
