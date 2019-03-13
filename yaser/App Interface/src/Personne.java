import java.util.Date;

public class Personne implements Ipersonne {
	Profil profil;
	String nome ,pnome;
	Date dateNais;
	static int id=0;
	double salaire;
	
	Personne(String nome ,String pnome,java.util.Date date,double salaire,Profil profil){
		id++;
		this.nome=nome;
		this.pnome=pnome;
		this.dateNais=(Date) date;
		this.salaire=salaire;
		this.profil=profil;
	}
	
	public void afficheId() {

		System.out.println(id);



	}


	@Override
	public void afiche() {
		System.out.println("Je suis le "+profil.libelle+" "+ nome+ " "+ pnome+ " né le "+ dateNais+ " mon salaire mensuel est "+ salaire+" euros");
	}
	@Override
	public double calculeSaleir() {
		
if(profil.libelle.equals("DG")) {

			

			salaire = salaire + (salaire*0.20);

			

		}else if(profil.libelle.equals("EM")) {

			this.salaire =salaire + (salaire*0.10);	

		}

		return salaire;
	}
	
	
}
