package com.lesson9one;

import java.util.Scanner;

public class Matrice {
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of your desirable matrix pls  : ? ");
		int size = scan.nextInt();
		
	
 
		int[][]a =new int[size][size];
		int[][]b =new int[size][size]; // a matrix vide 
		System.out.println("enter the elementss for the Matrix");
		
		
		 for(int row=0;row<size;row++) {
			   for(int col=0;col<size;col++) {
					a[row][col] = scan.nextInt();
					b[row][col] = a[row][col];
			   } 
				System.out.println();  
		 }

		 
		 
		 
		 
		 
		 // afficher ta matrice 
		 
		 for(int row =0;row<size;row++) {
			 for(int col=0;col<size;col++) {
				 System.out.print(b[row][col]+" ");
			 }
			 System.out.println();
		 }
		 

		 
		 
		 
		 // tranpoee et afficher 

		 }

}