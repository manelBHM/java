package test;



public class TestStatic {
	
	public static int a;
	
	
	public void print() {
		
		
		System.out.print("a:" + a  +"\n");
		
	}
	
	
	
	public static void staticPrint() {
		System.out.println("a" + a  +"\n");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		TestStatic e1 = new TestStatic ();
		TestStatic e2 = new TestStatic ();
		
		TestStatic.a =10;
		
		TestStatic.staticPrint();
		
		e1.staticPrint();
		e2.staticPrint();
		
		e1.a=20;
		e1.print();
		
		e2.a=30;
		e2.print();
		
		
		
		
		
   

	}

}
