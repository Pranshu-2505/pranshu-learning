package com.project.java;

import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer numStudents ;
		int sum = 0;
		
		
		while(true){
		try{
			System.out.print("Enter the number of Student ");
			 numStudents = Integer.parseInt(in.next());
			 break;
		}catch(Exception ex){
			System.out.println("Enter a number only");
			
			
		}
		
		}
		
		if(numStudents<=0)
		
		{
			System.out.println("Invalid number of students.");
            return;
		
		}

		int[] grades = new int[numStudents];

		for (int i = 0; i < grades.length; i++) {

			System.out.print("Enter the grade for student " + (1+i) + ": ");
			grades[i] = in.nextInt();
			if (grades[i] >= 0 && grades[i] <= 100) {

				continue;
			} else {
				System.out.println("Opps! Invalid grade, Pleaese try again...");
				return;
				//System.out.print("Enter the grade for student" + (1+i) + ": ");
				//grades[i] = in.nextInt();
				
				
			}
			

		}

		for (int grade : grades) {
			sum += grade;
		}

		double AvgGrade = 0.0;

		AvgGrade = (double) sum / grades.length;

		System.out.printf("The avagrage of %d student is %f", numStudents, AvgGrade);
		
		
		/*else{
			System.out.println("Opps Number of student can not be 0 or negative");
			System.out.print("Enter the number of Student ");
			numStudents = in.nextInt();
			
		}*/
			in.close();
		
		
	}
			
}
		



