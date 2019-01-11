
public class ConditionsTernaires {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int x = 10, y = 20;
		int max = (x < y) ? (y < 10) ? y%10 : y*2 : x;
		System.out.println(max);

	}

}
