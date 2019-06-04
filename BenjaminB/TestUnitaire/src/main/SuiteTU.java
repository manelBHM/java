package main;
import java.util.ArrayList;
public class SuiteTU {
	int number;
	public static boolean checkIfPair(int number) {
        int reste = number % 2;
        if (reste == 0) {
        	return true;
        }else {
    		return false;
        }
	}
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		int reste1 = number1 % 2;
		int reste2 = number2 % 2;
		int reste3 = number3 % 2;
		if (reste1==0 && reste2==0 && reste3!=0) {
			return true;
		}else {
		return false;
	}
		}
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		int result = number1+number2+number3;
		int reste = result % 2;
		if(reste == 0) {
			return true;
		}else {
		return false;
		}
	}
	public static boolean checkIfAllElementsPair(int[] array) {
		for(int i =0; i<array.length; i++) {
			int reste = array[i] % 2;
			if(reste==0) {
				return true;
			}else {
			}
		}
		return false;
	}
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		ArrayList<Integer>  a1 = new ArrayList<Integer>();   
		for(int i =0; i<array.length; i++) {
			if (array[i] % 2==0) {
		        a1.add(array[i]);
		}
	}
		return a1;
	}
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		ArrayList<Integer>  a1 = new ArrayList<Integer>(); 
		for(int i =0; i<array.length; i++) {
			if (array[i] % 2==0 && !a1.contains(array[i])) {         
		        a1.add(array[i]);
			}
		}
		return a1;
	}
	public static boolean checkSiTuPeuxAcheter(int prix) {
		for (int i = 0;i<prix;i=+2) {
			if(prix % 2 == 0 && prix <= 22) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	public static boolean checkCase1(double prix, int pourcentDeRemise) { 
		// t'as 100 euros, vérifie si tu peux acheter l'article solde
		double solde = 100;
		double prixSolde =  prix - ((prix/100)* pourcentDeRemise);
		if (prixSolde <= solde) {
			return true;
		}else {
		return false; 
		}
		}
	public static boolean checkCase2(int number1, int number2) { 
		// check si un des 2 chiffres, ou leur somme se divise par 7 
		if(number1 % 7 == 0 || number2 % 7 == 0 || (number1=+number2) % 7 == 0) {
			return true;
		}
		return false; 
		}
	public static boolean checkCase2a(int number1, int number2) {
		// check si un des 2 chiffres mais pas leur somme se divise par 7 
		if(( number1 % 7 == 0 || number2 % 7 == 0) && (number1=+number2)%7 ==0) {
			return true;
		}
		return false; 
		}
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou décroissant 
		if(((number1 < number2) && (number2 < number3))||((number1 > number2)&&(number2 > number3))) {
			return true;
		}
		return false; 
		}
	public static String game(int number) {
		String answer;
		if (number <= 0){
			answer = " ERROR ";
			return answer;
		}else if (number % 5 == 0 && number % 3 == 0) {
			answer = " [ Fizz Buzz ] ";
			return answer;
		}else if (number % 3 == 0) {
			answer = " [ Fizz ] ";
			return answer;
		}else if (number % 5 == 0) {
			answer = " [ Buzz ] ";
			return answer;
		}else {
				answer = Integer.toString(number);
		return answer;
}
}
	}