package exple5;

public class power {
	

		public static void main(String[] args) {
		
			int e;
			int resultat;
			for(int i=0; i < 10; i++) {
			resultat = 1;
			e = i;
			while(e>0) {
				resultat *=2;
				e--;
			}
			System.out.println("2 puissance" + i + "=" + resultat);
	}
}
}