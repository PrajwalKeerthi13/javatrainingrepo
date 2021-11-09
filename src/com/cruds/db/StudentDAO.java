package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.demo.Student;


public class StudentDAO {

	public Student getStudent(int rollNo) {
		String sql = "select rollno,name from student where rollno=?";
		Student s = null;

		try (Connection conn = DBConnectionManager.getConnection()) {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1, rollNo);
			ResultSet rs = ps.executeQuery();
			if(rs!=null & rs.next())
			{
				s = new Student(rs.getInt(1),rs.getString(2));
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public List<Student> getAllStudents()
	{
		String sql =" select rollno , name from student";

		List<Student> list =new ArrayList<>();
		
		try(Connection conn = DBConnectionManager.getConnection()) {
			PreparedStatement ps =  conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
					while(rs!= null && rs.next());
			{
				Student s = new Student(rs.getInt(1),rs.getString(2));
				list.add(s);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
			
	}

	public boolean create(Student student)
	{
		String sql = "insert into Student(rollno,name)values (?,?)";
		String sql2 = "insert into address (street,city,pincode,rollno) values(?,?,?,?)";
		int rows = 0;
		try (Connection conn = DBConnectionManager.getConnection()) {
			PreparedStatement ps =  conn.prepareStatement(sql);
			ps.setInt(1, student.getRollNo());
			ps.setString(2, student.getName());

			rows = ps.executeUpdate();
			PreparedStatement ps2 = conn.prepareStatement(sql2);
			ps2.setString(1, student.getAddress().getStreet());
			ps2.setString(2, student.getAddress().getCity());
			ps2.setString(3, student.getAddress().getPincode());
			ps2.setInt(4, student.getRollNo());
			
			rows= ps2.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;

	}
	public boolean update(Student s)
	{
		String sql = "update student set name=? where rollno=?";
		int rows=0;

		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setString(1,s.getName());
			ps.setInt(2, s.getRollNo());

			rows =ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}

	public boolean delete(int rollno)
	{
		String sql =" delete from student where rollno = ?";
		int rows =0;

		try(Connection conn=DBConnectionManager.getConnection())
		{
			PreparedStatement ps =conn.prepareStatement(sql);
			
			ps.setInt(1,rollno);	
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rows > 0;
		
	}

	
}

