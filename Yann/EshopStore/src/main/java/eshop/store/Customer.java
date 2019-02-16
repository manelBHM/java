package eshop.store;

public class Customer {

	private String fullName, address;
	private int postalCode;
	private static double id;
	
	public Customer(String fullName, String address, int postalCode)
	{
		super();
		
		this.fullName=fullName;
		this.address=address;
		this.postalCode=postalCode;
		id++;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public static double getId() {
		return id;
	}

	public static void setId(double id) {
		Customer.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fullname: " + this.fullName + " | " + "Address: " + this.address+ " , Postal Code: " + this.postalCode;
	}
	
	
}
