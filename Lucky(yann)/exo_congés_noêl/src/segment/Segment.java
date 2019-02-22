package segment;

public class Segment {
	
	private int long1, long2;
	
	public Segment(int extr1, int extr2)
	{
		long1 = extr1;
		long2 = extr2;
		ordonne();
	}
	
	protected void ordonne()
	{
	
		if(long1>long2)
			
		{
			int temp;
			
			temp = long1;
			long1 = long2;
			long2 = temp;
		}
		
	}
	
	
	public int longueur()
	{
		return long2 - long1;
	}
	
	
	
	public boolean appartient(int x)
	{
		return (x>=long1) && (x<=long2);
	}
	
	
	public String toString()
	{
		return "segment [" + long1 + ", " + long2 + "]";
	}
	
}