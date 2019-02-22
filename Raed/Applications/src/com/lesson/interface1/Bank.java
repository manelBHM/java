package com.lesson.interface1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
	 
		
		Scanner scan = new Scanner(System.in);
		int putMOney = 0;
		double balance =0.0;
		System.out.println("enter an starting amount of money : ");
		putMOney = scan.nextInt();
		
		while(putMOney != 3 ) {
			
			System.out.println("\nchoose  1  to depoiste money : ");
			System.out.println("\nchoose  2  to withdraw  money : ");
			System.out.println("\nchoose  3  to exit  : ");
			putMOney = scan.nextInt();
			switch(putMOney) {
			case 1: 
				System.out.println("\nenter some  money to deposite  : ");
				putMOney = scan.nextInt();
				balance += putMOney;
				System.out.println("\nyour current balance is : "+balance);
				break;
			case 2: 
				System.out.println("\nenter some  money to withdraw : ");
				putMOney = scan.nextInt();
				balance -= putMOney;
				System.out.println("\nyour current balance is : "+balance);
				break;
			case 3: 
				System.out.println("\nyour final balance is  : "+balance);
				break;
				
				
			}
			
		}
		
		

	}

}
