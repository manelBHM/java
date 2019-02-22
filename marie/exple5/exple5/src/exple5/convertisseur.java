package exple5;

import java.util.Scanner;

public class convertisseur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double eu;
		System.out.println("Euro conversion table:");
		System.out.println();
		for (eu=1; eu<=100; eu++) {
				System.out.println(eu+"="+eu*0.5);
		}
	}
}
