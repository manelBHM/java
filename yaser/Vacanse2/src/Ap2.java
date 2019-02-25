
public class Ap2 {

	
	
	
	public class Segment{
		private int extr1,extr2;
		
	}
	
	
	public  void segmant(int e1, int e2) {
		int extr1 = e1;
		int extr2 = e2;
		ordonne();
	}
	
	
	protected void ordonne() {
		int extr1 = 0;
		int extr2 = 0;
		if (extr1>extr2) {
			int temp;
			temp=extr1;
			extr1=extr2;
			extr2=temp;
		}
	}
	
	public int longeur () {
		int extr2 = 0;
		int extr1 = 0;
		return extr2 - extr1;
	}
	public boolean appartient(int x) {
		int extr2 = 0;
		int retr1 = 0;
		return (x >= retr1) && (x <= extr2);
	}
	
	public String toString() {
		String extr1 = null;
		String extr2 = null;
		return "segmant[" + extr1 + ","+ extr2 +"]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
