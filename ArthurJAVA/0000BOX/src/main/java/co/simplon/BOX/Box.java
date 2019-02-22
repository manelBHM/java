package co.simplon.BOX;

import java.util.ArrayList;

public class Box {

	String name;
	int ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Box(String name, int iD) {
		this.name = name;
		ID = iD;
	}
	ArrayList<String> liste = new ArrayList<String>();
	
	
}
