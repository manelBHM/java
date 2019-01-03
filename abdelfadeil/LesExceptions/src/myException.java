
public class myException{

	public static void main(String[] args) {
		

		int n = 4, m=0;
		int j;
		
		try {
			System.out.println(j=n/m);
		} catch (ArithmeticException e) {
			e.getMessage();
			
		}finally {
			System.out.println("une erreur");
		}
		
System.out.println(j=n-m);
	}

}
