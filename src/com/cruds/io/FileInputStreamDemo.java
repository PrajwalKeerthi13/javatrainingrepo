package com.cruds.io;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;



public class FileInputStreamDemo {
	public static void main(String[ ]args)
	{
		int size =0;
		InputStream is = null;
		
		try{
			is = new FileInputStream("C:\\Program Files\\Java\\jdk1.8.0_65\\README.html");
			size = is.available();
			//System.out.println(" size"+ size);
			for( int i=0;i<size;i++)
			{
				System.out.print((char)is.read());
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		finally
		{
			try{
				if(is !=null)
			is.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
