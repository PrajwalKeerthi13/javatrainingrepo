package com.cruds.io;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.FileNotFoundException;


import com.cruds.demo.Student;

public class SerialDemo {

	public static void main(String[] args) {
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.ser")))
		{
		Student s = new Student(101, "Anil",100,"sss");
		os.writeObject(s);
		System.out.println("Object written successfully");


		} catch (FileNotFoundException e) {

		e.printStackTrace();
		} catch (IOException e) {

		e.printStackTrace();
		}
		}


}
