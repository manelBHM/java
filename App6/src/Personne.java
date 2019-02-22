
public class Personne {
	
	private String nome;
    private Personne ami;
    
    Personne(String nome){
    this.nome=nome;	
    }
    Personne(String nome, Personne ami){
    	this.nome=nome;
    	this.ami=ami;
    }
    public void setPersonne(Personne ami) {
    	this.ami=ami;
    }
    
    public Personne getPersonne() {
    	return ami;
    }
    public String toString() {
    	if (this.ami != null) {
    		return 	this.nome + " est ami avec " + this.ami.nome;
    	} 
    	else {
    		return this.nome + " n'a pas d'mi ";
    	}
		
    }
}
