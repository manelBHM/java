
public class TestSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point('a', 5, 8), p2 = new Point('b', 9, 11);
		Segment s1 = new Segment(p1, p2);
		
		System.out.println("Segment 1\n" + "avant deplacement");
		s1.affiche();
		System.out.println("Longueur " + s1.longueur());
		
		  s1.deplaceOrigine(-9.7, 5.3);
	      s1.deplaceExtremite(5, -8);
	      System.out.println("apres deplacement");
	      s1.affiche();
	      System.out.println("Longueur " + s1.longueur());

	     Segment s2=new Segment('c', 11, 5.4, 'd', 9.2, -11.9);
	     System.out.println("Segment 2\n" + "avant deplacement");
	     s2.affiche();
	     System.out.println("Longueur " + s2.longueur());

	     s2.deplaceOrigine(-1.7, 5.8);
	     s2.deplaceExtremite(10, -7.4);
	     System.out.println("apres deplacement");
	     s2.affiche();
	     System.out.println("Longueur " + s2.longueur());

	}

}
