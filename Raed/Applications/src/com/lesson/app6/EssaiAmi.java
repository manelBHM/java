package com.lesson.app6;

public class EssaiAmi {
	
	

	public static void main(String[] args) {
		
		Personne lonelyFriend = new Personne("Rapson");
		
		
		Personne p1 = new Personne("Raed");
		Personne p2 = new Personne("Ali",p1);
		p1.setPersonne(p2);
		
		
		System.out.println(lonelyFriend.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	 

	}

}
