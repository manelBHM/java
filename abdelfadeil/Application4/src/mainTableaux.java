
public class mainTableaux {

	public static void main(String[] args) {
		lesTableaux t1 = new lesTableaux();
		int [] tab1 = t1.remplir1(5);
		t1.tableaux(tab1);
		
		int [] tab2 = t1.remplir2(9);
		t1.tableaux(tab2);
		
		int [] tab3 = t1.remplir3(8);
		t1.tableaux(tab3);

	}

}