package com.codewithcup;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
//		HashMap fees = new HashMap();
//		fees.put("Java", 50000);
//		System.out.println(fees);
		
		Map fees =  (Map) Proxy.newProxyInstance(
				HashMap.class.getClassLoader(),
				new Class[]{Map.class},
				new ObjectHandler(new HashMap<>())
				);
		
		fees.put("java", 50000);
		fees.put("C", 50000);
		System.out.println(fees);
	}
	
}
