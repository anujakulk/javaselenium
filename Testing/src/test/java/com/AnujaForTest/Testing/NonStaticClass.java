package com.AnujaForTest.Testing;

public class NonStaticClass {
	
	void print() {
		System.out.println(StaticClass.i); // Calling static variable into non static method
		StaticClass c = new StaticClass();
		System.out.println(c.j); // Calling non static variable form different class into non static method
		
			}
	static void copy() {
		System.out.println(StaticClass.i); //Calling static variable into static method
		StaticClass a = new StaticClass();
		System.out.println(a.j); // Calling non static variable form different class into static method
		
	}

	public static void main(String[] args) {
		NonStaticClass g = new NonStaticClass ();
		g.print();
		copy();
	}
}
