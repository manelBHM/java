package ModelP;

public class Personne {

	String firtName;
	String lastName;
	
	public Personne(String firtName, String lastName) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
	}

	public String getFirtName() {
		return firtName;
	}
	
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Personne [firtName=" + firtName + ", lastName=" + lastName + "]";
	}
}
