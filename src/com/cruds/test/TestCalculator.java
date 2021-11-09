package com.cruds.test;

import com.cruds.demo.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		int result = 0;
		try
		{
			result =c.divide(10, 0);
			System.out.println("inside Main call to divide===>");
		}
		catch(RuntimeException rte)
		{
		System.out.println("Runtime expetion" + rte.getMessage());
		}
		System.out.println("inside main ==> Result is"+ result);
		// TODO Auto-generated method stub

	}

}
