package test;

public class Test1 {
	
	
	
	
/*	static int sum(int n1, int n2) {
		int r=n1*n2;
		return (r);
		
	}

	public static void main(String[] args) {
		
	int	r=sum(5,5);
		System.out.println(r);
	
	}
		
		
		*/
		
		
	//-----------------------------------------------------------------------------
		
		
		
  /*public static void main(String[] args) {
		
		
		
		String[] name=new String[4];
				
		
		
		name[0]="ya";
	    name[1]="yt";
		name[2]="yr";
		name[3]="yy";
		
		for (int i=0; i<4; i++)
		 System.out.println(name[i]);
	
		
	





}*/
		
	/*int sum(int n1, int n2) {
		return(n1+n2);
	}
	
	int sum(int n1, int n2 , int n3) {
		return(n1+n2 + n3);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		int r1=new Test1().sum(3,7);
		int r2=new Test1().sum(2,4,3);
		System.out.println(r1 + "\n" + r2);}
		
		*/
		
	String name;
	String lastname;
	Test1(String name,String lastname){
		this.name=name;
		this.lastname=lastname;
	}

	String getTestInfo() {
		return (name + " " + lastname);
	}
	
	public static void main(String[] args) {
		
  Test1 info = new Test1("yaser","abbas" );

  System.out.println( info.getTestInfo());
 
	
	}

}
