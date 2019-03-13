package spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	//need to inject the session 
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	//@Transactional   we removed this bcoz we want the Service manage the Transaction
	public List<Customer> getCustomers() {
		
		//get the hibernate current session
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		//create query .... sort by lastname
		Query<Customer> query = currentSession.createQuery("from Customer order by lastName",
				Customer.class);
		//execute query and get current list
		List<Customer> customers = query.getResultList();
		//return list
		
		
	 
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		//get current hibernet session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer finally
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomers(int theId) {
		//get the current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		//retrieve/read from database using the primary key 
		Customer theCustomer = currentSession.get(Customer.class, theId);
		
 		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		
		//get current session
		 Session currentSession = sessionFactory.getCurrentSession();
		 
		 //delete object with current primary key
		 Query thequery = currentSession.createQuery("delete from Customer where id=:customerId");
		 
	
		 
		 thequery.setParameter("customerId", theId);
		 
		 thequery.executeUpdate();
		
	}
	
	

}
