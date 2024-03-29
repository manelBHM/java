package users;

import java.sql.Blob;

public class User {
    private int id;
    private String name;
    private String email;
    private String pass;
    private Blob avatar;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String email, String pass, Blob  avatar) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.avatar = avatar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Blob  getAvatar() {
		return avatar;
	}
	public void setAvatar(Blob avatar) {
		this.avatar = avatar;
	}
    
}
