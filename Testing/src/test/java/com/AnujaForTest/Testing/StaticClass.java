package com.AnujaForTest.Testing;

public class StaticClass {
	static int i = 10;
	int j = 20;
	
	static void print () {
	System.out.println(i);	// Calling static variable into static method
	StaticClass a = new StaticClass(); 
	System.out.println(a.j); // Calling non static variable into static method
	System.out.println();
	}
	
	void copy () {
	System.out.println(i); // Calling static variable into non static method
	StaticClass b = new StaticClass();
	System.out.println(b.j);  // Calling non static variable into non static method
	int i = this.j; // Calling non static variable into non static method using same variable
	//i = 30;
	System.out.println(i);
	}
	
	public static void main(String[] args) {
		print();
		StaticClass m = new StaticClass ();
		m.copy();
	}
}
