package com.lesson11;

public class Person {

	private String nom;
	private Person ami;

	public Person(String nom) {
		this.nom = nom;

	}

	public void setPerson(Person ami) {
		this.ami = ami;
	}

	public Person(Person ami, String nom) {
		this.ami = ami;
		this.nom = nom;

	}

	public Person getPerson() {
		return ami;
	}

	public String toString() {

		if (this.ami != null) {
			return this.nom + " est ami avec " + this.ami.nom;
		} else {
			return this.nom + " n'a pas d'mi ";
		}

	}

	public static class EssaiAmi {
		Person personnesoul;
		Person ami1;
		Person ami2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Personnesoul = new Person("suzane");
		Person ami1 = new Person("marc");
		Person ami2 = new Person(ami1, "francois");
		ami1.setPerson(ami2);

		System.out.println(Personnesoul.toString());
		System.out.println(ami1.toString());
		System.out.println(ami2.toString());

	}

}
