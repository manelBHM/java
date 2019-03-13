package App_Magazan.Magazan;

public class Televesion extends Product {
	
	String mark;
	

	public Televesion(String name, String descripation, double prise,String mark) {
		super(name, descripation, prise);
		// TODO Auto-generated constructor stub
	}


	public String getMark() {
		return mark;
	}


	public void setMark(String mark) {
		this.mark = mark;
	}
	
 public void aficherr() {
	 System.out.println(name+"\n"+"descripation :"+"\n"+ descripation+"\n"+"prise :"+prise+" -  €"+"\n"+"----------------------------" );
 }

 

}
