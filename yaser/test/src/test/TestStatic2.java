package test;

public class TestStatic2 {
	
	public String bookName;
	
	public String anotherBook;
	
	public int np;
	
	private static int bookecunte;
	
	public  TestStatic2( String bookName, String anotherBook, int np  ) {
		this.bookName=bookName;
		this.anotherBook=anotherBook;
		this.np=np;
		

	
	 int bookecunte = 0;
	bookecunte++;
		
	}
	
	public void printBook() {
		System.out.println("book =" + bookName);
		System.out.println("another book = " + anotherBook);
		System.out.println("np = " + np);
		System.out.println("-----------------------------");
	}
	
	public static void printNamperBook() {
		
		System.out.println("the total of the books = " + bookecunte );
	}
	
	
	

	public static void main(String[] args) {
	
		
		TestStatic2	b1 = new TestStatic2("java ", "yaser ",500 );
		TestStatic2	b2 = new TestStatic2("html ","ali",300 );
		TestStatic2	b3 = new TestStatic2("css", "keke", 200 );
		
	b1.printBook();
	b2.printBook();
	b3.printBook();
	
	
	printNamperBook();
	

	}

}
