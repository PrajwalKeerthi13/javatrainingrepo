package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
		int size = 0;
		
		try {
			FileInputStream is = new FileInputStream("C:/Program Files/Java/jdk1.8.0_65/README.html");
			
			size=is.available();
			byte[] data = new byte[size];
			FileOutputStream os = new FileOutputStream("oldfile.txt");

			is.read(data);
			os.write(data);
			

			is.close();
			os.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}  

}
}
