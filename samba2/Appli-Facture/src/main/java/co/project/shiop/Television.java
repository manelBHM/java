package co.project.shiop;

public class Television extends Product {
	private int size;
	private String led;
	private String television;

	public Television(String name, String marque, String description, double price, int size, String led) {
		super(name, marque, description, price);
		this.size = size;
		this.led = led;
	}

	public String toString(String teve) {
		return getMarque() + " - " + getName() + " - " + getDescription() + "-" + " Taille " + size + " Pouce" + " - "
				+ " Ecran " + led + " - " + " Prix " + getPrice();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLed() {
		return led;
	}

	public void setLed(String led) {
		this.led = led;
	}

	public String getTelevision() {
		return television;
	}

	public void setTelevision(String television) {
		this.television = television;
	}
}
