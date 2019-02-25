
public enum Langage {
	JAVA("JAVA", "ECLIPSE", 2018),
	C("Langage C", "BRACKET", 2018),
	JAVASCRIPT("JAVASCRIPT", "Visual Studio Code", 2018),
	PHP("PHP", "ATOM", 2018);
	
	
	protected String name = "";
	protected String editor = "";
	protected int years = 2018;
	
	
	
	//Constructeur
	Langage(String name, String editor, int years)
	{
		this.name=name;
		this.editor=editor;
		this.years=years;
		
	}
	
	
	
	// Methode
	public void getEditor()
	{
		System.out.println("Editeur: " + editor);
	}
	
	
	//Une autre Methode
	public String toShips()
	{
		return "Langage name: " + name + ";  Editeur: " + editor + "; Years:  " + years+'\n';
	}
	
}
