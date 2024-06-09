package com.AnujaForTest.Testing;

public class StaticMethod {
	public static void main(String[] args) {
		//M2();
		StaticMethod v10 = new StaticMethod();
		v10.M1();    
	}
	void M1() {
		M2(); // Calling static method into non static method from same class.
		NonStaticMethod V5 = new NonStaticMethod ();
		V5.M3(); // Calling Non static method into static method from another class.
		NonStaticMethod.M4();  // Calling static method into static method from another class.
		System.out.println("M1");

	}
	static void M2() {
		NonStaticMethod V2 = new NonStaticMethod ();
		V2.M3();  //Calling Non static Method into static method from another class
		StaticMethod v6 = new StaticMethod ();
		v6.M1();  // Calling Non static method into static method from same class.
		NonStaticMethod.M4();// Calling static method into static method from another class.
		System.out.println("M2");
	}

}


