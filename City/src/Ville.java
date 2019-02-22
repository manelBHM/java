
public class Ville {
	private String nom;
	protected int nmbrH;

	public Ville(String Lenom) {
		this.nom = Lenom;
		nmbrH = -1;
	}

	public Ville(String Lenom, int LenmbrH) {
		this.nom = Lenom;
		this.nmbrH = LenmbrH;
		if (LenmbrH < 0) {
			System.out.println("Le nombre d'habitant doit etre positif");

		}
	}

	public String getNom() {
		return nom;
	}

	public int getNmbrH() {
		return nmbrH;
	}

	public void setNmbrH(int NnmbrH) {
		if (NnmbrH < 0) {
			System.out.println("Le nombre d'habitant doit etres positif,  la validation na pas été pris en compte");
		} else
			nmbrH = NnmbrH;
	}

	public String presentToi() {
		String presente = "ville " + nom + " nombre d'habitant ";
		if (nmbrH < 0) {
			presente = presente + " inconu ";
		} else
			presente = presente + nmbrH;
		return presente;
	}
}
