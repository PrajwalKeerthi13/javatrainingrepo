package com.cruds.demo;

public class AccountBalance {

	public static void main(String[] args) {
		Balance current[] = new Balance[3];
		current [0] = new Balance("Prajwal.K",5000.00);
		current [1] = new Balance("sanjay.S",6000.34);
		current [2] = new Balance("siddartha.M",900.76);
		
		for(int i=0;i<3;i++)
			current[i].show();
		

	}

}
