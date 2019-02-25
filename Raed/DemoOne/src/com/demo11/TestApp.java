package com.demo11;

import java.util.Scanner;

public class TestApp {
	
	
	


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("choose a number : ?");

		
		int choice=0;
		do {
			show();
			int input= scan.nextInt();
			
			switch(input) {
			
			case 1:
				System.out.println(" go free ?");
				break;
				
			
			case 2:
				System.out.println(" do a favour ?");
				break;
				
			
			case 3:
				System.out.println(" stay here ");
				break;

			case 0:
				System.out.println(" good bye ");
				break;
			default:
				System.out.println("u have not chosen ");
				
			}System.out.println();
			
						
		}while(choice != 5);
		
	 
			
		}
	
	

	public static  void show() {
		System.out.println("choose a number : ?");
		System.out.println("choose number :1 to go free ");
		System.out.println("choose number :2 to do a favour ");
		System.out.println("choose number :3 to stay here  ");
		System.out.println("choose number :0 for good bye  ");
		System.out.println();
		}
		
	
	 

	 
		
		
		
		
		
		
		
		
		
		
		
	}




