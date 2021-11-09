package com.cruds.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("child 1");
		t1.start();
		t1.run();
		
		//for(int i=5;i>0;i--)
		//{
			//System.out.println(Thread.currentThread()+ "count"+i);
			
			try {
				//thread.sleep(2000);
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		//}
			System.out.println("main thread exiting===>>");

	}

}
