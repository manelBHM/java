
public class Calcule {

	public static void main(String[] args) {
		 //declarer 2 variable de type int
		int a=10,b=3;
	/*	int  a,b;
		a=10/3;
		b=10%3;
		System.out.println("the result "+a+b);*/
		
		//declare deux variable double 
		double c=15,d=2;
	/*	double c,d;
		c=10.3/3.0;
		d=10.0%3.0;*/
		
		System.out.println("result de a/b est :"+(int)(a / b));
		System.out.println("result de a%b est :"+(int)(a %b));
		
		System.out.println();
		
		System.out.println("result de a/b est :"+(double)(c / d));
		System.out.println("result de a%b est :"+(double)(c %d));
		
	 
	}

}
