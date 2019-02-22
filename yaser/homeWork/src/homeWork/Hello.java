package homeWork;

public class Hello {

	public static void main(String[] args) {
	Student my = new Student(null, null, null, null);
	
	my.name="yaser";
	my.lastname="abbas";
	my.type=gander.male;
	my.uname="ryt";

	System.out.println(my.getinfo()+"\n"+my.getname()+"\n"+my.getcard());
	
	}

}
