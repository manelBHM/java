package maven_projet1.mvn_test1;

public class PointRelais implements Delivery {

	private int number ;
	
	
	
	
	public PointRelais(int number) {
		this.number = number;
	}

	
	@Override
	public double getPrice() {
		if(number > 1 && number < 20) {
			return 0;
		}else if (number > 20 && number < 30) {
			return 1.99;
		}
		return 3.99;
	}

	@Override
	public void getInfo() {
		System.out.println("le type de votre delivery est : PointRelais");

	}

}
