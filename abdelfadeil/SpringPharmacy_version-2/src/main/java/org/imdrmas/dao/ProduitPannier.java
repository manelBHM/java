package org.imdrmas.dao;

import java.util.List;

import org.imdrmas.vente.ProduitsPannier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProduitPannier extends JpaRepository<ProduitsPannier, Long>{
	
	/*
	 *
	 * select p from Produits p where p.designation like :x
	 */
	@Query("select p from ProduitsPannier p where p.client.id_client=:x")
	public List<ProduitsPannier> chercherParClient(@Param("x")Long id_client);

	/*
	 * @Query("select p from ProduitsPannier p where p.client.id_client=:x and p.enStock=true"
	 * ) public List<ProduitsPannier> chercherComdClient(@Param("x")Long id_client);
	 */	

}
