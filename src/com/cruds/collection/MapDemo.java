package com.cruds.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer , String> studentMap =new HashMap<>();
		studentMap.put(101,"kiran");
		studentMap.put(201,"praju");
		
		System.out.println(studentMap.get(201));
		System.out.println(studentMap.get(333));
		
		studentMap.put(201,"chandan");
		System.out.println(studentMap.get(201));

	}

}
