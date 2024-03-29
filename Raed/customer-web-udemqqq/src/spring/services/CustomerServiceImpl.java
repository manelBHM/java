package spring.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.dao.CustomerDAO;
import spring.entity.Customer;

 
@Service
public class CustomerServiceImpl implements CustomerServices {

	

	 

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
 
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
	 
		return customerDAO.getCustomers();
	}



	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
		
		
	}



	@Override
	@Transactional
	public Customer getCustomers(int theId) {
		
		return customerDAO.getCustomers(theId);
	}



	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
		
	}

	
 
	
	
}





