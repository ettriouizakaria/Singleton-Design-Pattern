package org.mql.creational.singleton;

import java.awt.Toolkit;

public class Client {

	public Client() {
		knownUses();
//		exp01();
	}
	
	void exp01() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 =Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	//urilisation remarquable
	
	void knownUses() {
		Toolkit tk1 = Toolkit.getDefaultToolkit();
		Toolkit tk2 = Toolkit.getDefaultToolkit();
		System.out.println(tk1 == tk2);
		System.out.println(tk1.getClass().getName()); // a moontrer
		
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
