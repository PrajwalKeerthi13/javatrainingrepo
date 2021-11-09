package com.cruds.demo;

import java.util.Scanner;

public class NameDirectory {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] names = new String[25];
		int position=0;
		
		String choice="";
		do{
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			 
			System.out.println("Please enter the choice");
			
			System.out.println("1.Add name");
			System.out.println("2.Search name");
			System.out.println("3.show all name");
			System.out.println("4.Delete name");
			System.out.println("5.exit");
			
			 choice =sc.nextLine();
			
		
			switch(choice)
			{
				case "1": 
				
						System.out.println(" please enter the name");
						String s=sc.nextLine();
						names[position] =s;
						position++;
						System.out.println("Name added succesfully");
						break;
						
				case "2":boolean found =false;
						System.out.println("Enter the name to search");
						String searchName=sc.nextLine();
						for(int i=0;i<position;i++)
						{
							if(searchName.equals(names[i]))
							{
								found = true;
								break;
							}
						}
						if(found)
						{
							System.out.println("name"+searchName+" searched succefully");
						}
						else
						{
							System.out.println("searched name"+searchName+"not found");
						}
							break;
				case "3":
						for(int i=0;i<position;i++)
						{
							if(names[i]!=null)
							{
							System.out.println(names[i]);
							}
						}
						break;
				case "4":boolean del = false;
						System.out.println("please enter name  to delete");
						String delName=sc.nextLine();
						int i ;
						for(i=0;i<position;i++)
						{
							if(delName.equals(names[i]))
							{
								del = true;
								names[i]=null;
								break;
							}
							
						}
						if(del)
						{
							
							System.out.println("name"+delName+" deleted succefully");
						}
						break;
				case "5": System.out.println("Exiting application succesfully");
						break;
				
				default:
					System.out.println("Invalid choic");
					break;
				
			}
		}while(!choice.equals("5"));
			sc.close();

		}

}
