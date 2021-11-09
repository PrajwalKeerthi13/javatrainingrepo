package com.cruds.demo;

import java.util.Scanner;

public class JavaEleglble {

	public static void main(String[] args) {
		System.out.println("Enter ur name");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter ur age");
		int age=sc.nextInt();
		
		if(age>60)
		{
			System.out.println("Your too old");
		}
		else if(age<18)
		{
			System.out.println("your too young");
		}
		else{
			System.out.println("your eligeble");
		}

	}

}
