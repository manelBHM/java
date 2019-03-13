package com.interface1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarServicesTest {
	
	@Test  //this method should work according to th tutorial that i saw
	public void shouldDemonstrateInterface() {
		CarServices carServices = new CarServices();
		carServices.drives();
	}
	
	@Test
	public void arrayShowTest() {
		String[] array = {"one","tow","three"};
		String[] copiedArray = array.clone();
		assertSame(array,array);
		assertNotSame(array,copiedArray);
		
		//we can show all elements by iterating through them
		for(String str: copiedArray) {
			System.out.println(str);
		}
	}

 
	 
}	



