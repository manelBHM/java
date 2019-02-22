package co.product;

public class Television extends Product {
	private int size;
	private String slabType;

	public Television(String nom, String description, double price, int size, String slabType) {
		super(nom, description, price);
		this.size = size;
		this.slabType = slabType;

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
