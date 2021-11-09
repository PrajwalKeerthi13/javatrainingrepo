package com.cruds.demo;

import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num= new int[3];
		
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println("enter numbers");
			int n=sc.nextInt();
			num[i] = n;
			
			
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		while(true)
		{
			System.out.println("enter the number to search or to exit enter -1");
			
			int searchNum =sc.nextInt();
			if(searchNum == -1)
			{
				break;
			}
			boolean found = false;
			int pos = 0 ;
			for(int i=0;i<num.length;i++)
			{
				pos=pos+1;
				if(searchNum == num[i])
				
				{
					found=true;
				
					break;
				}
			
			} 
			if(found)
			{
				System.out.println("searched number is found in postion : " + (pos));
			}
			else
			{
				System.out.println("searched number is not found");
			}
		}
		
		sc.close();
	}

}
