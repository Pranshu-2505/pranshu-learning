package com.project.java;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program called HarmonicSum to compute the sum of a harmonic
		 * series, as shown below, where n=50000. The program shall compute the
		 * sum from left-to-right as well as from the right-to-left. Obtain the
		 * difference between these two sums and explain the difference. Which
		 * sum is more accurate?
		 * 
		 * Harmonic(n)= 1+1/2+1/3+1/4+.....+1/n;
		 */

		int maxDenominator = 5000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;

		for (int denominator = 1; denominator <= maxDenominator; denominator++) {

			sumL2R = sumL2R + ((double)1 / denominator);
			

		}

		for (int denominator = maxDenominator; denominator >= 1; denominator--) {

			sumR2L = sumR2L + ((double)1 / denominator);
			

		}
		
		System.out.println("The L2R is: " + sumL2R);
		System.out.println("The R2L is: " + sumR2L);
		System.out.println("The difference between sumL2R and sumR2L: " + (sumL2R - sumR2L));

	}

}
