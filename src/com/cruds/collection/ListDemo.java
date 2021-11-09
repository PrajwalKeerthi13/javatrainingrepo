package com.cruds.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args){
		
		List<String> names = new ArrayList<>();
		names.add("anil");
		names.add("kiran");
		names.add(" mahesh");
		names.add("Mahesh");
		
		names.add(0,"Akshay");
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		for(String s : names)
		{
			System.out.println(s);
		}
	}
}
