package com.project.java;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtractDigits extract = new ExtractDigits();
		extract.reverse(56349);

	}
	
	
	private void reverse(int n){
		
		//34567 == 7 6 5 4 3
		
		int digit;
		
		while(n>0){
			digit=n%10;
			n=n/10;
			System.out.print(digit+ " ");
		}
	}
	
	

}
