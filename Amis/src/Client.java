
public class Client extends Person {

	private static final int ID_CLIENT = 0;
	private int idClient;

	public Client() {
		super();
		this.setIdClient(0);
	}

	public Client(String nom, String prenm, String email, int idClient) {
		super(nom, prenm, email);
		this.setIdClient(idClient);
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		if (idClient <= 0) {
			throw new RuntimeException("Id-client must not be negatif");
		}
		this.idClient = idClient;
	}

	@Override
	public String toString() {
		return super.toString() + ", Identifient : " + idClient;
	}

}
