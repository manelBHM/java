
public class TestSegmant {
	
	
	
	public static void main(String[] args) {
		 
		
		int a,b, compare;
		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		compare=Integer.parseInt(args[2]);
		
		
		Segment s = new Segment(a,b);
		
		System.out.println("longer de segment"+ " "+ s.longeur());
        
		System.out .println("appartint"+ " "+ s.appartint(compare ));
	
		System.out.println(s.tostring());

	}

	

}
