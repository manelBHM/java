package appStor;

public class Client {
 
	private String fullName;
	private String adress;
	
	
	
	public Client() {
		super();
	}



	public Client(String fullName, String adress) {
		super();
		this.fullName = fullName;
		this.adress = adress;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	@Override
	public String toString() {
		return "Client [fullName=" + fullName + ", adress=" + adress + "]";
	}
	
}
