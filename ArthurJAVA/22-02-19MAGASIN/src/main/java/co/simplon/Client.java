package co.simplon;

public class Client {

	String fullname;
	String address;

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

	public Client(String fullname, String address) {
		this.fullname = fullname;
		this.address = address;
	}

}
