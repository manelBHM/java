package segments;

public class Segment {
	private int extr1, extr2;

	public Segment(int e1, int e2) {
		extr1 = e1;
		extr2 = e2;
		ordonne();
	}

	private void ordonne() {
		if (extr1 > extr2){
			int tampon;

			tampon = extr1;
			extr1 = extr2;
			extr2 = tampon;
		}
	}

	public void setExtr1(int a) {
		extr1 = a;
		ordonne();
	}

	public int getExtr1() {
		return extr1;
	}

	public void setExtr2(int a) {
		extr2 = a;
		ordonne();
	}

	public int getExtr2() {
		return extr2;
	}

	public int longueur() {
		return extr2 - extr1;
	}

	public boolean appartient(int x) {
		return (x >= extr1) && (x <= extr2) ;
	}

	public String toString() {
		return "segment [" + extr1 + ", " + extr2 + "]";
	}
}
