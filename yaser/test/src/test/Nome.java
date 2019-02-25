package test;

import java.util.Random;

public class Nome {

	public static void main(String[] args) {
		 int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

         String tableauCaractere[] = {"Raid","Yaser","Benjamin","Nayer","Marie","Mahfuz","Arthur","Nabil","Sami","Asmail","Fadeil","Tony"};

     

         int var= new Random().nextInt(tableauCaractere.length);     {

         System.out.println(tableauCaractere[var]);

         }
	}

}
