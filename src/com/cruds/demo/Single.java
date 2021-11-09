package com.cruds.demo;

 class ST extends Thread 
 {
	 public void run()
	 {
		 for(int i=0;i<5;i++)
		 System.out.println(i);
	 }

}
 class  Single
 {

	 {
		 for(int i=0;i<5;i++)
		 System.out.println(i);
	 }
	 public static void main(String[] args)
	 {
		 ST s= new ST();
		 s.start();
	 }
 }//using Inheritance
