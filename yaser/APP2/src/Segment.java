
public class Segment {

private int extr1 , extr2;
	
	public  Segment(int extr1, int extr2) {
		this.extr1=extr1;
		this.extr2=extr2;
		ordonne();
	}

	protected void ordonne() {
	 
		if (extr1 > extr2 ) {
			int temp;
			
			temp = extr1;
			extr1 = extr2;
			extr2= temp;
		}
		
	}
	
	
	public int longeur() {
		return extr2 - extr1;
	}
	

	public boolean appartint(int x) {
		return (x >= extr1) && (x <= extr2);
		
	}
	
	public String tostring() {
		return "segmant [" + extr1 + ","+extr2+"]";
	}
	
}
