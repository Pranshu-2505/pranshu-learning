package com.project.java;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number");
		number = in.nextInt();
		
		
			
			switch (number) {
			case 1:
				System.out.println("Number entered is one");
				break;
			case 2:
				System.out.println("Number entered is Two");
				break;
			case 3:
				System.out.println("Number entered is Three");
				break;

			default:
				System.out.println("opps! Number out of range");
				break;
			}
			
			in.close();
			
		}
		

	}


