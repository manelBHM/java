package co.project.shiop;

public class Customer {
	private String fullName;
	private String address;

	public Customer(String fullName, String address) {
		this.address = address;
		this.fullName = fullName;
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
}
