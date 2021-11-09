package com.cruds.demo;

public class Calculator {
	public int divide(int x ,int y)
	{
		int result =0;
		int[] nums= new int[3];
		Student s = null;
		try
		{
			s.getRoll();
			nums[3]=99;
			System.out.println("before divison");
			result =x/y;
			System.out.println("After didvison");
			
		} catch (ArithmeticException ae) {
			System.out.println("Invalid divisor :" + ae.getMessage());
			// TODO: handle exception
		}
		catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("Invalid array index " + aib.getMessage());
		}
		finally
		{
			System.out.println("****Inside finally index in calculator****");
		}
		return result;
		
	}

}
