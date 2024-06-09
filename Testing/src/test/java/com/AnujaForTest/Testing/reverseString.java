package com.AnujaForTest.Testing;
import java.util.*;

public class reverseString {
	public static void main(String[] args) {
		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter the String:");
		String mystring = inputString.nextLine();
		System.out.println("Origional String:"+ mystring);
		String reverse = "";
		for (int i=0; i< mystring.length(); i++) {
			reverse =  mystring.charAt(i)+ reverse;		

		}
		System.out.println("Reverse String:" + reverse );
	}
}

