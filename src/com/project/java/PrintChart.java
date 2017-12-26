package com.project.java;

import java.util.Scanner;

public class PrintChart {
	
	public int[] readInput(){
		
		int numBars;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of bars: ");
		numBars=in.nextInt();
		int[] array = new int[numBars];
		int i=0;
		while( i < numBars){
			System.out.println("Enter bar" +(1+i)+"value: ");
			array[i]=in.nextInt();
			i++;
		}
		System.out.println(array.length);
		return array;
	}
	
	
	public void printChart(int[] chart){
		int j=0;
		while(j<chart.length){
			
			for (int i = 0; i<chart[j]; i++) {
				System.out.print("*");
				
			}
			System.out.println(" " +"("+chart[j]+")");
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintChart ab = new PrintChart();
		//ab.readInput();
		ab.printChart(ab.readInput());

	}

}
