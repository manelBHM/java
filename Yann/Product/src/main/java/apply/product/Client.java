package apply.product;

public class Client<fullname, address, codePostal> {

	private String fullname;
	private String address;
	private int codePostal;

	public Client(String fullname, String address, int codePostal)
	{
		super();
		this.fullname=fullname;
		this.address=address;
		this.codePostal=codePostal;
	}

	
	public Client(String address, int codePostal)
	{
		super();
		this.address=address;
		this.codePostal=codePostal;
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


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fullname: " + this.getFullname() + " | " + "Address: " + this.getAddress()+" , Code Postal: " + this.getCodePostal();
	}




}
