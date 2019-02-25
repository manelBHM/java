import java.util.Comparator;

public class Stagiaire {
	
	String nom;
	int age ; 
	int id ;
	
	public Stagiaire(int id,String nom,int age ) {
		this.nom=nom;
		this.age=age;
		this.id=id;
	}
	
	

	public int getAge() {
		return age;
	}



	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;}

	@Override
	public String toString() {
		return ("["+ "id=" +id+" "+"nom=" + nom+" "+ " age=" + age+"]\n");
		
	}
	
	public static Comparator<Stagiaire> idCom = new Comparator<Stagiaire>() {
		public int compare(Stagiaire s1, Stagiaire s2) {
		int id1 = s1.getId();
		int id2 = s2.getId();
		
		return id1-id2;
		}};

		
		public static Comparator<Stagiaire> ageCom = new Comparator<Stagiaire>() {
			public int compare(Stagiaire s1, Stagiaire s2) {
			int age1 = s1.getAge();
			int age2 = s2.getAge();
			
			return age1-age2;
			}};
			
			
			
			public static Comparator<Stagiaire> nomCom = new Comparator<Stagiaire>() {

				@Override
				public int compare(Stagiaire o1, Stagiaire o2) {
				String nom1 = o1.getNom();
				String nom2 = o2.getNom();
				
					return nom1.compareTo(nom2);
				}
			
				};




			
			}
