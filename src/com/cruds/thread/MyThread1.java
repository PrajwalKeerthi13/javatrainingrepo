package com.cruds.thread;

public class MyThread1 extends Thread{
	
	public MyThread1(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
		System.out.println("Inside child Thread Run Meathed " + Thread.currentThread());
		for (int i=5;i>0;i--)
		{
			System.out.println(this +"Count"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}

