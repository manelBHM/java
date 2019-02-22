package homeWork;

public class   Student extends Unevircty implements info {

String name;
String lastname;
gander type;
  
Student(String name, String lastname,gander type,String uname){
	this.lastname=lastname;
	this.name=name;
	this.type=type;
	this.uname=uname;
}

String getinfo() {
	return ("my name is "+name+" "+lastname+"\n"+"my sax is :"+type+"\n"+"the name of my unevirsite is :"+uname);
}

@Override
public String getname() {
String vill="fontenay";
int age=30;
	return ("i leave in :"+vill+"\n"+"my age is :"+age);
}

}