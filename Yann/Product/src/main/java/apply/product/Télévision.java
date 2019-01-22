package apply.product;

public class Télévision extends Product{
	
	private double size;
	private String typEcran;
	
	public Télévision(String name,  String description, double price, double size, String typEcran)
	{
		super(name,  description, price);
		this.size=size;
		this.typEcran=typEcran;
		
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getTypEcran() {
		return typEcran;
	}

	public void setTypEcran(String typEcran) {
		this.typEcran = typEcran;
	}
	

	
	
}
