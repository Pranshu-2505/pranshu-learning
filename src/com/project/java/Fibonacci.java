package com.project.java;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int  firstNumber = 0;
		
		int secondNumber = 1;
		
		int sum=0;
		int total=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number for fibonacci series: ");
		
		int number = in.nextInt();
		
		System.out.print(secondNumber+ " ");
		
		for (int i = 1; i < number; i++) {
			
			// 1 1 2 3 5 8 13
			
			sum= firstNumber + secondNumber;
			/*
			 * 0=0+1
			 * 2=1+1
			 *  =
			 */
			total=total+sum;
			firstNumber=secondNumber;
			secondNumber=sum;
			
			System.out.print(sum+ " ");
		}
		
		System.out.println();
		System.out.println(total+1);
		double avg = (double)total/20;
		System.out.println(avg);
		
		in.close();

	}

}
