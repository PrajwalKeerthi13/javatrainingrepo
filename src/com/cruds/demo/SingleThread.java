package com.cruds.demo;


class ThreadDemo implements Runnable
{
	public void run(){

		for(int i=0;i<5;i++)
			System.out.println(i);
	}
}

class SingleThread
{

	public static void main(String[] args) {
		ThreadDemo s= new ThreadDemo();
		Thread t = new Thread(s);
		t.start();

	}

}//using Interface
