public class Cenerics1 {
public class MaClasseGeneric <T1, T2>{
	private T1 param1;
	private T2 param2;
	public MaClasseGeneric (T1 param1 , T2 param2) {
		this.param1= param1;
		this.param2= param2;
	}
	public T1 getParam1() {
		return param1;
	}
	public T2 getParam2() {
		return param2;
	}
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaClasseGeneric<Integer, String> maClase = new MaClasseGeneric<Integer, String>(1, "valeur 1");
		 
		Integer param1 = maClase.getParam1();
		String param2 = maClase.getParam2();
		
		
	}

}
