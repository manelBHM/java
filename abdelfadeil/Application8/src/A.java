
abstract class A {

	abstract void decrire();

	public String toString() {
		return "je suis A : ";
	}

}

class B extends A {

	void decrire() {
		System.out.println(this + "je suis B la fille de A");
	}

}

class C extends A {
	void decrire() {
		System.out.println(this + "je suis C la fille de A");
	}
}