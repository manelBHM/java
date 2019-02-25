package com.interface1;

 
public class CarServices {
	
	public void drives() {
	/*	Car bmw = new BMW();
		Car porsche = new Porsche();
		Car mercedes = new Mercedes();
			bmw.drive();
			porsche.drive();
			mercedes.drive();
			
			
		*/
		//we can make also String[] instead 
		Car[] cars = {new BMW(),new Porsche(),new Mercedes()};
		
		for(Car car: cars) {
			
			car.drive();
	 
			
			
		}
	
	}
	 
		
	
	
	

}