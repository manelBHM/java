package co.apiMagasin;

public class Television extends Produit {
	private int size;
	private String slabStyle;

	public Television(String nom, String descriptive, int size, String slabStyle, double prix) {
		super(nom, descriptive, prix);
		this.size = size;
		this.slabStyle = slabStyle;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSlabStyle() {
		return slabStyle;
	}

	public void setSlabStyle(String slabStyle) {
		this.slabStyle = slabStyle;
	}

}
