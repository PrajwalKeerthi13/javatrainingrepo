package com.cruds.thread;

public class MyThreadR implements Runnable {
	Thread t;
	public MyThreadR(String name)
	{
		t=new Thread(this,name);
		//t.start();
	}
	@Override
	public void run()
	{
		System.out.println("Inside Child Thread Run Method"+ Thread.currentThread());
		for(int i=5;i>0;i--)
		{
			System.out.println(this + "count" +i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Exiting rRUN METHOD"+this);
		
		
	}
}
