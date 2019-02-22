
public class App8 {

	public static void main(String[] args) {

		
		A[] tab;
		
		tab = new A[5];
		tab[0] = new B();
		tab[1] = new C();
		tab[2] = new C();
		tab[3] = new B();
		tab[4] = new C();
		
      for (int i=0; i<tab.length;i++) {
    	  tab[i].decrire();
      }
		
		
		
		
	}

}
