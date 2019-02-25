package co.simplon;

public class Television extends Produit {

	int size;
	String slabType;

	public Television(String name, String description, int price, int size, String slabTyp) {
		super(name, description, price);
		this.size = size;
		this.slabType = slabTyp;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSlabType() {
		return slabType;
	}

	public void setSlabType(String slabType) {
		this.slabType = slabType;
	}
}
