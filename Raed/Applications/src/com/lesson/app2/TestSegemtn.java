package com.lesson.app2;

public class TestSegemtn {

	public static void main(String[] args) {
		
		   int a, b, point_compare;
	        a = Integer.parseInt(args[0]);
	        b = Integer.parseInt(args[1]);
	        
	        point_compare = Integer.parseInt(args[2]);

		Segment seg = new Segment(a,b);
		
		System.out.println("longeur de "+seg+" : "+seg.longeur());
		
		seg.appart(point_compare);
		
		if(seg.appart(point_compare)) {
			System.out.println(point_compare+" appartient au :"+seg);
		}else {
			System.out.println(point_compare+" n'appartient pas au :"+seg);
		}
		
		
		
		
		
		
		 
		
	}

}
