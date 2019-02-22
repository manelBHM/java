package com.lesson9one;

public class Test {

	public static void main(String[] args) {
		 
		
		try {
			System.out.println("=>"+(1/1));
		}catch(Exception e) {
			//System.out.println("error "+e.getMessage());  //it does not print infoms with error as u already know the class the curse error 
			e.printStackTrace();  // thi prints to which class this error belong to 
		}finally {
			System.out.println("action fatie systematicement");
				
		}

		
		
		
		
	}

}
