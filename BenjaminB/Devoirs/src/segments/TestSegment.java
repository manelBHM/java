package segments;

class TestSegment  {
	public static void main(String[] arg) {
		Segment s = new Segment(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]));
		int point;
		System.out.println("Longueur du " + s + " : " + s.longueur());
		point = Integer.parseInt(arg[2]);
		if (s.appartient(point))
			System.out.println(point + " appartient au " + s);
		else 
			System.out.println(point + " n'appartient pas au " + s);
	}
}