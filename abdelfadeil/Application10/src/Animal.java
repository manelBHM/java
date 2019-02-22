abstract class Animal {
	abstract void devine();
}

class Oiseau extends Animal {
	void devine() {
		System.out.println("Je suis un Oiseau");
	}
}

class Chat extends Animal {
	void devine() {
		System.out.println("Je suis un Chat");
	}
}

class EssaiAnimal {
	static java.util.Random alea = new java.util.Random();

	static Animal tirage() {
		return (Math.abs(alea.nextInt()) % 2 == 0 ? new Oiseau() : new Chat());
	}


public static void main(String[] arg)
{
tirage().devine();

}
}