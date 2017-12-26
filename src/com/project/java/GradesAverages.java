package com.project.java;

import java.util.Scanner;

public class GradesAverages {

	Integer numStudent = 0;

	private void call() {

		Scanner in = new Scanner(System.in);
		// System.out.println("Enter the number of Student: ");
		// numStudent = in.next();
		// numStudent = Integer.parseInt(in.next());

		while (true) {
			try {

				System.out.println("Enter the number of Student: ");
				numStudent = Integer.parseInt(in.next());
				if (numStudent > 0) {
					break;
				} else {
					System.out.println("Enter a positive number only");
				}

			} catch (Exception ex) {
				System.out.println("Enter a number only");

			}

		}

		

	}

	private void average() {
		int numsum = numStudent.intValue();
		Scanner in = new Scanner(System.in);
		 int[] grades = new int[numsum];
	        
	        //double sum = 0;
	        int    i   = 0;
	        try { while (i < numsum)
	        	
	        	{
	        	
	            System.out.printf("Enter the grade for student %1$d: ", (i+1));
	            int grade = in.nextInt();
	            
	            // chek if grade is between 0 and 100
	            if ((grade >= 0) && (grade <= 100)) {
	                grades[i] = grade;
	               // sum      += grade;
	                i++;
	                continue;
	            }
	            System.out.println("Invalid grade, try again...");
	        }}
	        	catch (Exception ex) {
					System.out.println("hghgkjgjkk");
					
				}
				
	        	
			for (int j : grades) {
				System.out.println(j);
			}
					
				}
			
			
			

		



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradesAverages ab = new GradesAverages();
		//System.out.println(ab.numStudent);
		ab.call();
		System.out.println(ab.numStudent);
		ab.average();

	}

}
