package com.AnujaForTest.Testing;

public class NonStaticMethod {
	public static void main(String[] args) {
		//NonStaticMethod v8 = new NonStaticMethod ();
		//v8.M3();
		M4();

	}
	void M3 () {
		StaticMethod s1 = new StaticMethod ();
		s1.M1();
		System.out.println("M3");
	}

	static void M4 () {
		System.out.println("M4");
	}

}


