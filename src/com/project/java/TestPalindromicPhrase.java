package com.project.java;

import java.util.Scanner;

public class TestPalindromicPhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestPalindromicPhrase ab = new TestPalindromicPhrase();
		
		ab.call();
		ab.pali();

	}
	
	String cal;
	
	private void call() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Phrase: ");
		cal=in.nextLine().toLowerCase();
		System.out.println(cal);
		in.close();
		
	}
	
	private void pali(){
		
		String reverse="";
		String r = Sanitize(cal);
		for (int i = (r.length()-1); i>=0; i--) {
			
			reverse += r.charAt(i);
			
		}
		
		if (r.equals(reverse)) {
			
			System.out.println("palindrome");
			
		}else{
			System.out.println("not");
		}
		
	}
	
	private String Sanitize(String s){
		
		String str="";
		
		for (int i = 0; i < s.length(); i++) {
			
			switch (s.charAt(i)) {
			case '.':
            case ',':
            case ' ':
            case '-':
            case '\'':
            case '!':
            case '?': break;
			default:
				str += s.charAt(i);
				break;
			}
			
			
		}
		
		return str;
		
	}

}
