package maven_projet1.client_maven;

public class Customer {

	private String fullname;
	private String address;
	
	
	public Customer(String fullname, String address) {
		this.fullname = fullname;
		this.address = address;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
