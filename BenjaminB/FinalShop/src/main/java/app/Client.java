package co.simplon;

public class Client {
	
	String fullname;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	String adress;
	int ID;
	public Client(String fullname, String adress, int iD) {
		this.fullname = fullname;
		this.adress = adress;
		ID = iD;
	}
	
	

}
