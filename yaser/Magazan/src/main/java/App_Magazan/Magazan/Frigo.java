package App_Magazan.Magazan;

public class Frigo extends Product {

	String mark;
	
	public Frigo(String name, String descripation, double prise,String mark) {
		super(name, descripation, prise);
	
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public void afich() {
		System.out.println(name+"\n"+"descripation :"+"\n"+ descripation+"\n"+"prise :"+prise+" -  €"+"\n"+"----------------------------");
	}

}
