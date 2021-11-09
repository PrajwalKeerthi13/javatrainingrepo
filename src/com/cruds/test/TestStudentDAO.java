package com.cruds.test;



import java.util.List;

import com.cruds.db.StudentDAO;
import com.cruds.demo.Address;
import com.cruds.demo.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
		
		Address addr = new Address("2nd cross", "Tumkur", "572101");//with adding set address
		Student s = new Student(777, "Raghu");
		s.setAddress(addr);
		StudentDAO dao= new StudentDAO();
		dao.create(s);
		System.out.println(s);
		
		Address addr2 = new Address("Chickpete", "Bangalore", "560080");//with adding set address
		Student s2 = new Student(333, "sanjay",addr2);
		
		System.out.println(s2);
				
		
		//StudentDAO dao= new StudentDAO();
		/*if(dao.delete(999))///deleting of elements
		{
			System.out.println("Record deleted");
		}
		else
		{
			System.out.println("record not found");
		}
		/*Student s1 = new Student(999,"Kumar");
		dao.update(s1);//Update the values in database
		
		/*List<Student> list = dao.getAllStudents();
		for (Student s : list)
		{
			System.out.println(s);//////taking data from the list
		}
		
		
		/*Student s1 = new Student(999,"chandu");
		
		 if(dao.create(s1))
		 {
			 System.out.println("Student create successful");
		 }*///we have to insert the value externally
	}
}