import java.util.ArrayList;

public class Star {

	public static void main(String[] args) {
		// Person p = new Person("Fane ", "samba ", " viavania@gmail.com");
		// System.out.println(p);

		// Employer em = new Employer("Kent", "Clark", "kent.clark@gmail.fr",
		// 3550);
		// System.out.println(em);

		// Client id = new Client("Taylor", "swift", "taylor.swift@gmail.com",
		// 1);
		// System.out.println(id);

		// Person[] person = new Person[3];
		// person[0] = new Person("Fane ", "samba ", " viavania@gmail.com");
		// person[1] = new Employer("Kent", "Clark", "kent.clark@gmail.fr",
		// 3550);
		// person[2] = new Client("Taylor", "swift", "taylor.swift@gmail.com",
		// 12);

		ArrayList<Person> person = new ArrayList<>();
		person.add(new Person("Fane ", "samba ", " viavania@gmail.com"));
		person.add(new Employer("Kent", "Clark", "kent.clark@gmail.fr", 3550));
		person.add(new Client("Taylor", "swift", "taylor.swift@gmail.com", 12));

		// traite tous le monde
		for (Person element : person) {
			System.out.println(element.getNom());
		}

		System.out.println("------------------------------------------------");

		// traite employer
		for (Person element : person) {
			if (element instanceof Employer) {
				System.out.println(element);
			}
		}
	}
}
