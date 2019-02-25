import java.util.Scanner;

public class Test {
 
	public static void main(String[] args) {
		SalleService service = new SalleService();
 
		service.create(new Salle("A", "Salle 1"));
		service.create(new Salle("B", "Salle 2"));
		service.create(new Salle("C", "Salle 3"));
		service.create(new Salle("D", "Salle 4"));
		Scanner sc = new Scanner(System.in);
		System.out.println("On a "+Salle.nbre_Salles+" salles :");
		for (Salle s : service.findAll())
			System.out.println("" + s);
 
		System.out.println("Supprimer la salle avec id = ");
		int id_s=sc.nextInt();
		service.delete(service.findById(id_s));
		System.out.println("Salle d'iD "+id_s+"supprimée, le nbre de salles devient "+Salle.nbre_Salles+" salles");
 
		System.out.println("Modifier la salle avec id = ");
		id_s=sc.nextInt();
		Salle salle = service.findById(id_s);
 
		System.out.println("Salle d'iD "+id_s+" modifiée : le nbre de salles est "+Salle.nbre_Salles+" salles");
 
		
		System.out.println("Donner le nouveau code :");
		salle.setCode(sc.nextLine());
		System.out.println("Donner le nouveau libelle :");
		salle.setLibelle(sc.nextLine());
		service.update(salle);
 
		System.out.println("On a "+Salle.nbre_Salles+" salles :");
		System.out.println("La liste des salles après les mises à jour :");
		for (Salle s : service.findAll())
			System.out.println("" + s);
 
	}
 
}
