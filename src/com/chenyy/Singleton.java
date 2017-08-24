package com.chenyy;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getSingletonInstance() {
		
		synchronized (instance) {
			if (instance == null) {
				instance = new Singleton();
			}
		}
		
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
		
		
	}
}
