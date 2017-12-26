package com.project.java;

import java.util.Scanner;

public class GradesStatistics {
	
	
	int numStudent;
	public static int[] grades;
	
	public static void readGrades(){
		
		int numStudent;
		int grade;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of student");
		numStudent = in.nextInt();
		grades = new int[numStudent];
		int i=0;
		while(i<numStudent)
		{
			System.out.println("Enter the grade for student " +(i+1));
			grade=in.nextInt();
			
			if (grade>=0 && grade<=100) {
				grades[i]=grade;
				i++;
			}else{
				System.out.println("Error! Grade must be integer between 0 and 100!");
			}
		
		
			
			
			
		}
	
	}
	
	public static void printArray(int[] array){
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	
	
	public static double average(int[] array){
		double avarage=0;
		double sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		avarage= sum/array.length;
		return avarage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradesStatistics.readGrades();
		GradesStatistics.printArray(grades);
		System.out.println(GradesStatistics.average(grades));

	}

}
