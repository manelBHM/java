package apply.product;

public class Four extends Product{

	private String fonction;

	public Four(String name, String description, double price, String fonction)
	{
		super(name,  description, price);
		this.fonction=fonction;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


}
