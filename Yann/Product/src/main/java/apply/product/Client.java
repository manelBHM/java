package apply.product;

public class Client<fullname, address> {
	
	private String fullname;
	private String address;
	
	public Client(String fullname, String address)
	{
		this.fullname=fullname;
		this.address=address;
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



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fullname: " + this.getFullname() + " | " + "Address: " + this.getAddress();
	}
	
	
	
	
}
