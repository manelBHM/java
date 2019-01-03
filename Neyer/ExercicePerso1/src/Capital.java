
public class Capital extends Ville{
	
	String nomCapital;
	
	public Capital(String nomP, int nbH,String nomC){
		
		super(nomP,nbH);
		
		this.nomCapital= nomC;
		
	}
	
	public Capital(int nbH,String nomC) {
		super(nbH);
		this.nomCapital=nomC;
	}
	
	protected String affiche() {
		
		String afficher;
		
		afficher = super.affiche();
		
		afficher = afficher+", et sa capital est "+nomCapital;
		
		return afficher;
	}
}
