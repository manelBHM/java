package Dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import entities.Stagiaire;

@Repository
public class satgiaireDao {
	
	@Autowired
    EntityManager entityManager;
	
	
	@Autowired
	private SessionFactory sessionFactory;
	public void create(Stagiaire st) {
		Session session = null; 
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			String sql = "INSERT INTO stagiaire'"+st+"' ";
			Query query = entityManager.createQuery(sql);
			query.executeUpdate();
			session.beginTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

}
	
	public void findAll() {
		Session session = null; 
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
		//	int id = (int) session.get(Stagiaire, id);
		//	System.out.println("Le stagiaire a été créé avec succes id= "+ id);
			session.beginTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

}

}
