public class Capitale extends Ville {
	protected String pays;

	public Capitale(String Lenom, String Lepays) {
		super(Lenom);
		this.pays = Lepays;
	}

	public Capitale(String Lenom, int LenmbrH, String Lepays) {
		super(Lenom, LenmbrH);
		this.pays = Lepays;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String Lepays) {
		pays = Lepays;
	}

	public String presentToi() {
		String presente = super.presentToi();
		presente = presente + " capitale de " + pays;
		return presente;
	}

}
