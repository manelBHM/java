import java.util.Date;

class Voiture implements IdVoiture {

	private String brand;
	private String model;
	private Date dateSorti;
	private double price;
	public Profile profileCar;

	public Voiture(String brand, String model, Date dateSorti, double price, Profile profileCar) {
		this.brand = brand;
		this.model = model;
		this.dateSorti = dateSorti;
		this.price = price;
		this.profileCar = profileCar;
	}

	@Override
	public Double calculeVoiture() {
		if (profileCar.libelle.equals(" X6 ")) {
			return price = price + (price * 0.20);
		} else if (profileCar.libelle.equals(" TT ")) {
			return price = price + (price * 0.10);
		}
		return price;
	}

	@Override
	public void presentevoiture() {
		System.out.println(" la " + this.brand + " model " + this.model + " sorti le " + this.dateSorti + " Prix : "
				+ this.price + "€ " + this.profileCar.libelle);
	}
}
