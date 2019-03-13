package exple7;

public class Capitale extends Ville{

	private String pays;
	public Capitale(String leNom, String lePays)
{
	super(leNom);
	pays = lePays;
}
	public Capitale(String leNom, String lePays, int leNbreH)
{
	super(leNom, leNbreH);
	pays = lePays;
	
}
	public String getPays() {
		return pays;
}
	public void setPays(String nomPays) {
		pays = nomPays;
		
}
	public String presenteToi() {
		String presente = super.presenteToi();
		return presente;
}
}
