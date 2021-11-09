package com.cruds.demo;

public class Ex2 {

	public static void main(String[] args) {
		try{
			int i=Integer.parseInt(args[0]);
			System.out.println("i");
			
		}
		catch(RuntimeExpection e)
		{
			System.out.println(e);
		}
		catch(NumberFormatExpection e)
		{
			System.out.println(e);
		}

	}

}
