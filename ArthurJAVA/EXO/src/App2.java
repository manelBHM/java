
public class App2 {
	
	int x;
	int y;
	int z;
	
	public App2(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void testSegment() {
		
		
		System.out.println("Les valeurs doivent être entrées dans l'ordre, x < y");
		System.out.println("x est " + x + ", et y est " + y);
		
		System.out.println("la longueur du segment est " + (y-x));
		
		if(x<z && y>z) {
			System.out.println(z + " est compris entre ces deux valeurs");
		}
		else {
			System.out.println(z + " n'est pas compris entre ces deux valeurs");
		}
		
}
	
	
	

	public static void main(String[] args) {

		App2 nombre = new App2(-15,-10,-12);
		nombre.testSegment();
		
	}

}
