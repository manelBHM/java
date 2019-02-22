package com.lesson.app5;

import java.util.Scanner;

public class Matrix {
	
	//Ecrire un programme Java qui permet de lire, transposer et afficher une matrice carrée n x n.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		//filling out the the matrix
		System.out.println("type your matrix size please :");
		
		int size = scan.nextInt();
		int[][] a = new int[size][size];
		
		//decalring  a empty matrix 
		int[][] b = new int[size][size];
		System.out.println("................");
		for(int row=0;row<size;row++) {
			for(int col=0;col<size;col++) {
				a[row][col] = scan.nextInt();
				//filling the empty matrix
				b[row][col] = a[row][col];
			}
			System.out.println();
		}
		
		//printing out the matrix
		for(int row=0;row<size;row++) {
			for(int col=0;col<size;col++) {
				System.out.print(" "+b[row][col]);
			  
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println(" Transforming matrix :");
		//matrix transformed 
		for(int row=0;row<size;row++) {
			for(int col=0;col<size;col++) {
				System.out.print(" "+b[col][row]);
			  
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
