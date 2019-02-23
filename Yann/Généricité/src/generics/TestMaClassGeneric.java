package generics;


public class TestMaClassGeneric {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// @SuppressWarnings("all")
		
 MaClassGeneric<String, String, Integer> e1 =new MaClassGeneric<String, String, Integer>("Lucky", "Stan", 23);
 MaClassGeneric<String, String, Integer> e2 =new MaClassGeneric<String, String, Integer>("Ships1", "Ships2", 29);
			   
              System.out.println("|"+e1+"|");
              System.out.println("-------------------------------------");
              System.out.println("|"+e2+"|");
              System.out.println("-------------------------------------");
              
	}

}
