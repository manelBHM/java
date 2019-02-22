package com.one;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutApp {

	public static void main(String[] args) {
		
		
		File newFile;
		FileOutputStream fos = null;
		String s = "data to b inserted into file";
		try {
			
			//Specify the file path here
			newFile = new File("/home/raed/NewFile.txt");
			fos = new FileOutputStream(newFile);

	          /* This logic will check whether the file
		   * exists or not. If the file is not found
		   * at the specified location it would create
		   * a new file*/
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			
			  /*String content cannot be directly written into
			   * a file. It needs to be converted into bytes
			   */
			byte[] sbyte = s.getBytes();
			fos.write(sbyte);
			fos.flush();
			System.out.println("file has been written sucessfully ");
		}catch(Exception e) {
			e.getMessage();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
