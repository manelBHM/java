package com.simplon.Pokemon;

/**
 * Hello world!
 *
 */
public class App extends Pokemon
{
    public App(String nom, String elem, int PV, int atk, String weakness, String resist) {
		super(nom, elem, PV, atk, weakness, resist);
		// TODO Auto-generated constructor stub
	}
static int win =0;
	public static void combat(Pokemon  pokemon1,Pokemon  pokemon3/*, String weakness, String resist */) {
		System.out.println(pokemon1.atk);
		System.out.println(pokemon3.atk);
/*switch (elem) {
case  pokemon1.elem = pokemon3.weakness:
pokemon1.atk=pokemon1.atk*2;
break;
case pokemon1.elem = pokemon3.resist:
pokemon1.atk=pokemon1.atk/2;
case pokemon3.elem = pokemon1.weakness:
pokemon3.atk=pokemon3.atk*2;
System.out.println(pokemon3.atk);
break;
case pokemon3.elem = pokemon1.resist:
pokemon3.atk=pokemon3.atk/2;
break;
}*/
 if (pokemon1.elem.equals(pokemon3.resist)){
 		pokemon1.atk=pokemon1.atk/2;
  		}
  else if (pokemon1.elem.equals(pokemon3.weakness)){
  		pokemon1.atk=pokemon1.atk*2;}
  else if (pokemon3.elem.equals(pokemon1.resist)){
  		pokemon3.atk=pokemon3.atk/2;}
  else if (pokemon3.elem.equals(pokemon1.weakness)){
  		pokemon3.atk=pokemon3.atk*2;}
  else {pokemon1.atk=pokemon1.atk;
		pokemon3.atk=pokemon3.atk;}  
do {
	System.out.println(pokemon1.atk);
	System.out.println(pokemon3.atk);
	pokemon1.PV=pokemon1.PV-pokemon3.atk;
	pokemon3.PV=pokemon3.PV-pokemon1.atk;
System.out.println(pokemon1.nom + " : " +pokemon1.PV );
System.out.println(pokemon3.nom + " : " +pokemon3.PV);
if(pokemon1.PV<=0) {
System.out.println(pokemon3.nom+" à gagné fair and square");
}
else if(pokemon3.PV<=0){
System.out.println(pokemon1.nom+" à gagné fair and square");
}else{}
}

while (pokemon1.PV==0||pokemon3.PV==0);
	}




	


		/*if(Pokemon1.PV>Pokemon2.PV) {
			//win = true;
			System.out.println(Pokemon1.nom+" à gagné parce qu'il avait la plus grosse");
		}else {
			//win = false;
			System.out.println(Pokemon2.nom+" à gagné parce qu'il avait la plus grosse");
		}*/

	

	public static void main( String[] args )
    {
    	Pokemon pokemon1 = new Pokemon("Blindépine", "feuille", 160, 90, "feu", "eau");
    	Pokemon pokemon2 = new Pokemon("Tortank", "eau", 120, 60, "foudre", "feu");
    	Pokemon pokemon3 = new Pokemon("Sulfuras", "feu", 150, 80, "eau", "feuille");
    	
    	combat(pokemon1, pokemon3);
    }
}
