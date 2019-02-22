package com.demo11;

public class BankAccount {
	//bank name
	public String bankname ="BNPP";
	
	
	public void welcome() {
		System.out.println("welcome to our bank mr "+accountholder);
	}
	//let make a methodd to welcome the user if we dont know the name
	String welcomeMessage(String name) {
		return " welecome to our bank "+name;
	}
	
	
	//acount holder's name 
	private String accountholder = "Raed";
	


	//bank  account balance 
	private double balance = 100.0;
	
	//Method to return account holder
	public String getAccountholder() {
		return accountholder;
	}
	
	//Method to get the balance 
	public double getBalance() {
		return balance;
	}
	//Method to deposit money into the account 
	public String deposit(double amount) {
		balance += amount;
		
		return "depoist amount"+amount+
				"\nNew balance is "+balance;
	}
	
	//Method to withdraw money from the bank account 
	public String withdraw(double amou) {
		
		//check to make sure there are enough funds 
		if(balance < amou) {
			amou=balance;
			//balance-=amou;

		}else {
			balance -= amou;
		}
		
		return "withdrawal amonut "+amou+
				"\nNew balance "+balance;
		
	}
	
	
	
	

}
