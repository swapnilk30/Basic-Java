package com.velocity.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
	List<String> list=new ArrayList<String>();
		
		
		//ArrayList<String> list=new ArrayList<String>();
		
		list.add("java");
		list.add("python");
		list.add("C++");
		
		
		//System.out.println(list);
		for(String x:list) {
			System.out.println(x);
		}
		
	}

}
