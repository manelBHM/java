package co.project.shiop;

public class Cafetiere extends Product {
	private String cafe;

	public Cafetiere(String marque, String name, String description, double price) {
		super(marque, name, description, price);
		// TODO Auto-generated constructor stub
	}

	public String getCafe() {
		return cafe;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}

}
