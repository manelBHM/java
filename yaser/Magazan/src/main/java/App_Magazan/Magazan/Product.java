package App_Magazan.Magazan;

public class Product {
	
	protected String name;
	protected String descripation;
	protected double prise;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, String descripation, double prise) {
		super();
		this.name = name;
		this.descripation = descripation;
		this.prise = prise;
	}
	
	public void pro() {
		System.out.println(name+"\n"+descripation+"\n"+prise);
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescripation() {
		return descripation;
	}


	public void setDescripation(String descripation) {
		this.descripation = descripation;
	}


	public double getPrise() {
		return prise;
	}


	public void setPrise(double prise) {
		this.prise = prise;
	}




	@Override
	public String toString() {
		String state = name+"\n"+ descripation+"\n"+"prise :"+prise+" -  €"+"\n"+"-------------------------" ;
	    return state;
	}


	
	
	
	
	

}
