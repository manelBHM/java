
public class TestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Four aliment1 = new Four(180,30);
		Four aliment2 = new Four(260,55);
		
		aliment1.cuire();
		aliment2.cuire();
		
		aliment1.setPuissance(1);
		aliment1.cuire();

	}

}
