package palindrome;

public class RenverserMot {
	
	
	public static String inverser(String mot)
	
	{
		String invers = new StringBuilder(mot).reverse().toString();
		return invers;
		
	}
	
	public static boolean isPalindrome(String mot)
	{
		
		String invers = inverser(mot);
		boolean isPal = mot.equals(invers);
		return isPal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "test";
		System.out.println(inverser(str));
		System.out.println(isPalindrome(str));
		
	}


}
