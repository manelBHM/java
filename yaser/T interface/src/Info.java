
public class Info implements Unevircity {
	
	String name,pname;
	int age;
	
	Info(String name, String pname,int age){
		this.name=name;
		this.pname=pname;
		this.age=age;
	}

	@Override
	public String getname() {
		String uname = "ryt";
		return ("my name is :"+" "+ name +" "+ pname+ "\n"+ "my age is :"+" "+age+"\n"+"my un is :"+" "+uname);
	}

}
