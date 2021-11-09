package com.cruds.db;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class BookDAO {

	public List<Book1> getAllBooks(){


		String sql ="select bookId,titel,price from Book1";
		List<Book1> list=new ArrayList<>();
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps =(PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs =(ResultSet) ps.executeQuery();
			while(rs != null && rs.next())
			{
				Book1 s = new Book1(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				list.add(s);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	public boolean create(Book1 book)
	{
		String sql="insert into Book(BookId,title,price) values (?,?,?)";
		int rows = 0;
		try(Connection conn = DBConnectionManager.getConnection())
		{	
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1,book.getBookId() );
			ps.setString(2, book.getTitle());
			ps.setDouble(3,book.getPrice() );

			rows=ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}
		return rows > 0;

	}	



}

