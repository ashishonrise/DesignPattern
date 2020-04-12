package com.ashish.singleton;

public class SingletonClass {
	private static SingletonClass singletonClass;
	
	private SingletonClass(){
		
	}
	
	public static synchronized SingletonClass getSingalton(){
		
		if (singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		
		return singletonClass;
	}
	


}
