package classes.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter implements Writer {
	
	private String fileName;
	private Path path;
	private String content;
	
	

	public FileWriter(String fileName) {
		super();
		this.fileName = fileName;
	}


	public void start() {
		path = Paths.get(fileName);
		content="";

	}

	public void writeLine(String line) {
		content+=line+"%n";

	}

	public void stop() {
		try {

			Files.write(path, String.format(content).getBytes());
			
		}catch(IOException e) {
			//e.getStackTrace();
			System.err.println("Not valid way to edit the Bills.. ");
		}

	}

}
