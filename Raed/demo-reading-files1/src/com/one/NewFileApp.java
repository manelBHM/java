package com.one;

import java.io.File;
import java.io.IOException;

public class NewFileApp {

	public static void main(String[] args) {
		//create an empty new file 
		
		File newFile = new File("/home/raed/NewFile.txt");
		
		try {
			boolean var = newFile.createNewFile();
			
			if(var) {
				System.out.println("the file has been sucussefully created !!");
			}else {
				System.out.println("this file already exist ...... ");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
