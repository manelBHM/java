
public class MaSousclasse {
	
	/**
	* Afficher un message de test
	* @deprecated methode non compatible
	* reason for why it was deprecated
	*/
	
	@Deprecated // s'utilise sur des interfaces, classe et methodes pour dire qu'il est obsolete
	public void maMethode() {
		System.out.println("yes");
	}

	@Override //dis que c'est une reecriture de methode
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
