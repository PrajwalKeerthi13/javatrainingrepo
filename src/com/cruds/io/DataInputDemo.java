package com.cruds.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputDemo {

	public static void main(String[] args) {
		
		try(DataInputStream os = new DataInputStream(new FileInputStream("student.dat"))){
		// TODO Auto-generated method stub{
			System.out.println(is.readInt());
			System.out.println(is.readDouble());
			System.out.println(is.readUTF());
			System.out.println("File Written success");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
