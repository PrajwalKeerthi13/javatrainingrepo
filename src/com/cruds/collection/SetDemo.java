package com.cruds.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args){
		Set<String> names = new HashSet<>();
		names.add("anil");
		names.add("kiran");
		names.add(" mahesh");
		names.add("Mahesh");
		for(String s: names)
		{
			System.out.println(s);
		}
		
	}

}
