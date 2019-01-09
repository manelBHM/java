
public class Segment {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		String ch = "Bonjour";
		String chInverse = "";
		int chLg = ch.length(); 
		System.out.println("\nch : " + ch); 
		for(int i = chLg -1; i>-1; i--) 
		{ chInverse+= ch.substring(i, i +1); } 
		System.out.println("chInverse: " + chInverse);
	}

}
