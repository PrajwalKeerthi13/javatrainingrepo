package com.cruds.demo;

import java.awt.print.Book;
import java.util.Scanner;

import com.cruds.db.Book1;

public class TestBook {

	public static void main(String[] args) {
		Book1[] b1 = new Book1[25];
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		
		String choice = "";
		do{
			System.out.println("Please select your Choice:");
			System.out.println("1.Add Books");
			System.out.println("2.Show all Books");
			System.out.println("3.Search Books by Title");
			System.out.println("4.Show Books by price");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextLine();
			
			switch(choice)
			{
			case "1":
				System.out.println("Adding Books");
				System.out.println("Enter a Book Title");
				String BookTitle = sc.nextLine();
				System.out.println("Enter Book Price");
				double BookPrice = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the Book ID");
				int BookId = sc.nextInt();
				sc.nextLine();
				Book1 b2 = new Book1(BookId, BookTitle, BookPrice);
				b1[pos] = b2;
				pos++;
				System.out.println("Books added successfully");
				break;
				
			case "2":
				System.out.println("Display Books");
				
				for(int i = 0;i < pos;i++)
				{
					Book1 b3 = b1[i];
					if(b3 !=null)
					{
					b3.printBook();
					}
				}
				break;
			
			case "3":
				System.out.println("Search Books by Title");
				System.out.println("Enter title of a book");
				
				String searchTitle = sc.nextLine();
				boolean found = false;
				for(Book1 b : b1)
				{
					if(b!=null && b.getTitle().equals(searchTitle))
					{
						found = true;
						b.printBook();
						break;
					}
				}
				if(!found)
				{
					System.out.println("Sorry!!! Book not Found");
				}
				break;
				
			case "4":
				System.out.println("Search Book by Price");
				System.out.println("Enter price of a book");
				
				double searchPrice = sc.nextDouble();
				sc.nextLine();
				
				for(int i = 0;i < pos;i++)
				{
					Book1 b4 = b1[i];
					if(b4 !=null && b4.getPrice()>= searchPrice)
					{
						b4.printBook();
					}
				}
				break;
				
			case "5":
				System.out.println("BYE!!!!! Exiting Application");
				break;
				
			default:
					System.out.println("Invalid choice!!!!!");
					break;
				}
				
			}while(!choice.equals("5"));
		sc.close();
		// TODO Auto-generated method stub

	}

}
