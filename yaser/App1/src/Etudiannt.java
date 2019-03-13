
public class Etudiannt {
	
	
	private String nome;
	
	public Etudiannt(String nome) {
		this.nome=nome;
	}
	public String travailler() {
		return this.nome + " se met au travail !";
	}
	public String seReposer() {
	return this.nome + " se repose !";
	}


     public class TestEtudiannt {

    	 Etudiannt nom1;
    	 Etudiannt nom2;
     }
	public static void main(String[] args) {
		
  
  Etudiannt nom1 = new Etudiannt ("toto");
  Etudiannt nom2 = new Etudiannt ("toto");
  
  System.out.println(nom1.travailler());
  System.out.println(nom2.seReposer());
	
	}
}
