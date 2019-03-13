
public class NomVilleException extends Exception{

	public NomVilleException(String message) {
		super(message);
	}
	public void Ville(String pNom, int pNbre, String pPays)
		throws NombreHabitantsException, NomVilleException{
		
		if(pNbre<0) {
			throw new NombreHabitantsException(pNbre);
		}
		if(pNom.length()<3) {
			throw new NomVilleException("le nom de la ville est inferieur à 3 caracteres! nom=" +pNom);
		}
		else {
			nbreInstance++;
			nbreInstanceBis++;
			
			String nomVille = pNom;
			String nomPays = pPays;
			int nbreHabitants = pNbre;
			this.setCategorie();
		}
		
		
}
	
	private void setCategorie() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}
	}


