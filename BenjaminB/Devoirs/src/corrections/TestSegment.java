package corrections;

public class TestSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Segment s = new Segment(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		int point;
		System.out.println("La longueur du segment "+s+" est "+s.longueur());
		point=Integer.parseInt(args[2]);
		if(s.appartient(point)) {
			System.out.println("le point "+point+" appartient au "+s);
		}
		else {
			System.out.println("le point "+point+" n'appartient pas au "+s);
		}
	}

}
