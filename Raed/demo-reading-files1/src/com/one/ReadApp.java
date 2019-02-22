package com.one;

import java.io.*;

public class ReadApp {

	public static void main(String[] args) {
		
		File f = new File("/home/raed/testFile.txt");
		
		BufferedInputStream bs = null;
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(f);
			
			bs = new BufferedInputStream(fis);
			while(bs.available() > 0) {
				System.out.print((char)bs.read());
			}
			
		}catch(Exception e) {
			e.getMessage();
		}
		finally {
			try {
				fis.close();
				bs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}

}
