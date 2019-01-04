package com.tableau.project;

import static java.lang.System.out;

import java.util.Scanner;

public class Matrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		out.print("Donnez la dimonsion de la martice ? :");
		int size = sc.nextInt();

		int[][] line = new int[size][size];
		int[][] colonne = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				out.print(" Entrez un nombre entier " + "pour la rangée " + i + " et la colonne " + j + " : ");
				line[i][j] = sc.nextInt();
				colonne[j][i] = line[i][j];
			}
		}

		System.out.println(" La matrice originale  est : ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(" " + line[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(" La matrice transposeé est : ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(" " + line[j][i] + " ");
			}
			System.out.println();
		}

	}
}
