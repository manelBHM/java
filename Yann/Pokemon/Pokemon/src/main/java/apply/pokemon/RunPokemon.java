package apply.pokemon;

public class RunPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pokemon pk1 = new Pokemon("Pikachu", 70);
		Pokemon pk2 = new Pokemon("Mewtow", 100);
		Pokemon pk3 = new Pokemon("Mew", 90);
		Pokemon pk4 = new Pokemon("Soporifik", 80);
		System.out.println("Nombre de Pokémon crée: " + pk4.getId());
		System.out.println("");
		System.out.println(pk1);
		System.out.println("");
		System.out.println(pk2);
		System.out.println("");
		System.out.println(pk3);
		System.out.println("");
		System.out.println(pk4);
		System.out.println("");
		pk1.Fight(pk3);
		pk2.Fight(pk4);


	}

}
