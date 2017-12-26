package com.project.java;

import java.util.Scanner;

public class CheckVowelsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String string = in.next().toLowerCase();
		
		char[] stringarray = new char[string.length()];
		
		for (int i = 0; i < stringarray.length; i++) {
			
			stringarray[i]=string.charAt(i);
		}
		
		for(char temp:stringarray){
			
			System.out.print(temp);
			
		}
		
		int count=0;
		int count2=0;
		for (int i = 0; i < stringarray.length; i++) {
			
			if (stringarray[i]=='a'||stringarray[i]=='e'||stringarray[i]=='i'||stringarray[i]=='o'||stringarray[i]=='u') {
				
				count++;
				
			}
			
			if (stringarray[i]>'0' && stringarray[i]<'9') {
				
				count2++;
				
			}
			
			
		}
		
		System.out.println();
		double vovel;
		double digit;
		vovel=((double)count/string.length())*100;
		digit=((double)count2/string.length())*100;
		
		System.out.printf("Number of vovel %d (%.2f %% ), %nNumber of digit %d (%.2f %% )%n" , count ,vovel,count2,digit);

				

	}

}
