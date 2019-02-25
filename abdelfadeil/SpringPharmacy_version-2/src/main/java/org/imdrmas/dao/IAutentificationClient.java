package org.imdrmas.dao;

import org.imdrmas.users.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IAutentificationClient extends JpaRepository<Client, Long>{
	
	@Query("select c from Client c where c.email like :x")
	public Client findByEmail(@Param("x")String email);

}
