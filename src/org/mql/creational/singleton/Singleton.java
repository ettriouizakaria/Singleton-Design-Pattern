package org.mql.creational.singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	//Au cas de la necessité de plus qu'une ligne de code
	static {
		
	}

	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
