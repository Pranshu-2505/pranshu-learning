package com.project.java;

import java.util.Scanner;

public class TestPalindromicWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestPalindromicWord ab = new TestPalindromicWord();
		ab.call();
		ab.pali();

	}

	String cal;

	private void call() {

		System.out.println("Enter the String: ");
		Scanner in = new Scanner(System.in);

		cal = in.next();
		System.out.println(cal);
		in.close();

	}

	private void pali() {
		String reverse = "";
		int backindex = (cal.length()-1);

		for (int i=backindex; i >= 0; i--) {

			reverse += cal.toLowerCase().charAt(i);

		}
		
		if (cal.toLowerCase().equals(reverse.toLowerCase())) {
			
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}

	}
	
	

}
