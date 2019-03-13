package users;

import ConnectionSql.sqlConnection;

public class Customer extends sqlConnection {
 public String fullname;
 public String address;
 
public Customer(String fullname, String address) {
	super();
	this.fullname = fullname;
	this.address = address;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

 public static int saveCustomer(Customer c) {
	int resSt = 0;
	con = sqlConnection.getConnection();
	String strInsert = "INSERT INTO `customer`(`fullname`, `address`) VALUES (`"+c.fullname+"`, `"+c.address+"` )";
	//con = st.prepareStatement(strInsert);
	
	return resSt;
}
  
}
