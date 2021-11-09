package com.cruds.test;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cruds.db.Book1;
import com.cruds.db.BookDAO;
public class BookJDBCDemo {





		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int position=0;
			String Choice = "";
			Book1[] barray = new Book1[25];

			do
			{
				System.out.println("******Book Details*******");
				System.out.println("1.Add Book");
				System.out.println("2.Display all books");
				System.out.println("3.Exit");

				System.out.println("Enter your choice");

				Choice = sc.nextLine();

				switch(Choice)
				{

				case "1":
					System.out.println("Please enter book id");
					int BookId = GetInt();
					System.out.println("Please enter book title");
					String title = sc.nextLine();
					System.out.println("Please enter book price");
					double price = GetDouble();
					Book1 b =new Book1(BookId,title,price);
					barray[position]=b;
					position++;
					BookDAO dao = new BookDAO();

					if(dao.create(b))
					{
						System.out.println("Student created succesfully");
					}
					break;

				case "2":
					System.out.println("Displaying all Book details:");

					BookDAO dao1= new BookDAO();
					List<Book1> list = dao1.getAllBooks();

					for(Book1 s:list)
					{
						System.out.println(s);
					}
					break;

				case "3":


					System.out.println("BYE EXIXTING APPLICATION!!!!!");
					break;
				default:
					System.out.println("Invalid choice!!");
					break;
				}

			}while(!Choice.equals("3"));
			sc.close();

		}



		private static double GetDouble() {
			Scanner sc1 = new Scanner(System.in);
			while(true)
			{
				try
				{
					return sc1.nextDouble();
				}
				catch (InputMismatchException e) {
					sc1.next();
					System.out.println("That's not"+ "an double. Try agian");
				}

			}


		}


		private static int GetInt() {
			Scanner sc = new Scanner(System.in);
			while(true)
			{
				try
				{
					return sc.nextInt();
				}
				catch (InputMismatchException e) {
					sc.next();
					System.out.println("That's not"+ "an Integer. Try agian");
				}

			}


		}



	

	// TODO Auto-generated method stub

}


