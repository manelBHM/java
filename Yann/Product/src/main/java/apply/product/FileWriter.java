package apply.product;
import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;


public class FileWriter implements Writer {

    private String filename;

    private Path path;

    private String content;


    public FileWriter(String filename) {

        this.filename = filename;

    }


	public void start() {
		// TODO Auto-generated method stub
		  path = Paths.get(filename);

	        content = "";
		
	}


	public void writeLine(String line) {
		// TODO Auto-generated method stub
		 content += line + "%n";
	}


	public void stop() {
		// TODO Auto-generated method stub
		   try {

	            Files.write(path, String.format(content).getBytes());

	        } catch (IOException e) {

	            System.err.println("Impossible de rédiger la facture");

	        }

	    }
		
	}
