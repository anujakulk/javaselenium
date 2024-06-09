package com.AnujaForTest.Testing;

public class reverseArray {
	public static void main(String[] args) {

		int a[] = {10,20,30};
		int reverseArray = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			reverseArray = a.length + reverseArray;

			System.out.println(reverseArray);

		}
	}
}