package com.project.java;

public class HarmonicSeriesSum {

	public double GeometricSeriesSum() {

		int firstNumber, lastNumber;
		double sum;

		firstNumber = 1;
		lastNumber = 100;
		sum = 0.0;

		while (firstNumber <= lastNumber) {

			sum = sum + (1.0 / firstNumber);

			firstNumber=firstNumber*2;

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber, lastNumber;
		float sum;

		firstNumber = 1;
		lastNumber = 1000;
		sum = 0.0f;

		while (firstNumber <= lastNumber) {

			sum = sum + (1.0f / firstNumber);

			firstNumber++;

		}

		System.out.println("The HarmonicSeriesSum of 1 to 1000 is: "+sum);
		
		HarmonicSeriesSum Gss = new HarmonicSeriesSum();
		
		System.out.println("The GeometricSeriesSum is:" +Gss.GeometricSeriesSum());
		
		

	}

}
