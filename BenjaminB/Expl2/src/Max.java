
public class Max {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int max = (x < y) ? ((y < 10) ? y % 10 : y * 2) : x ;
		System.out.println(max);
	}
}
