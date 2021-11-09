package com.cruds.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		String msg =" hello";
		byte[] data = msg.getBytes();
		
		
		FileOutputStream os;
		try {
			os = new FileOutputStream("first.text");
			os.write(data);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
