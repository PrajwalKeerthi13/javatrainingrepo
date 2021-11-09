package com.cruds.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {

	public static void main(String[] args) {
		
		try(DataOutputStream os = new DataOutputStream(new FileOutputStream("Student.dat")))
		{
			os.writeInt(101);
			os.writeDouble(3.565);
			os.writeUTF("Anil");
			System.out.println("File Written success");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
