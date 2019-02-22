
public class Personne {

	
	private  String nom;
	private Personne ami;
	
	
	
	public Personne(String nom){
		this.nom = nom;
		
	}
	
	
	
	
	public Personne(Personne ami , String nom) {
		this.ami = ami;
		this.nom = nom;
		
	}
	
	
    public void setPersonne(Personne ami ) {
        this.ami = ami;
    }
 
    public Personne  getPersonne() {
        return ami;
    }
    
    public  String toString() {
    	
    	if (this.ami != null) {
    		return 	this.nom + " est ami avec " + this.ami.nom;
    	} 
    	else {
    		return this.nom + " n'a pas d'mi ";
    	}
		
		
		
    	
    }
    
    public static class EssaiAmi{
    	Personne personnesoul;
    	Personne ami1 ;
    	Personne ami2 ;
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Personne Personnesoul = new Personne("suzane");
	Personne ami1 = new Personne("marc");
	Personne ami2 = new Personne(ami1,"francois");
	ami1.setPersonne(ami2);
	
   System.out.println(Personnesoul.toString());
   System.out.println(ami1.toString());
   System.out.println(ami2.toString());
		
	}
    }

