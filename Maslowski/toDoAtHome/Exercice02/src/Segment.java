import java.util.Scanner;

public class Segment {
	
	private int ext1;
	private int ext2;
	private int point;
	
	public Segment(int ext1, int ext2, int point) {
		this.ext1 = ext1;
		this.ext2 =  ext2;
		this.point = point;
	}
	
	public void presentation() {
		System.out.println("Votre segment est [" + ext1 + "," + ext2 + "] et le point à vérifier est " + point +".");
	}
	
	public void longueur() {
		int taille = Math.abs(ext2 - ext1);
		System.out.println("La longueur du segmentde votre segment est : " + taille);
	}
	
	public void inorout() {
		if (ext1 < point && point < ext2) {
			System.out.println(point + " fait parti du segment.");
		}
		else {
			System.out.println(point + " ne fait pas parti du segment.");
		}
	}
	
	public static void main(String[] args) {
		
		Segment seg = new Segment(-35, 44, 100);
		seg.presentation();
		seg.longueur();
		seg.inorout();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
