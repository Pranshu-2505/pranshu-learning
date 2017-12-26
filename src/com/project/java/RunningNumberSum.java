package com.project.java;

public class RunningNumberSum {

	public int RunningNumberProduct() {

		int firstNumber = 1, lastNumber = 10;
		int product = 1;

		while (firstNumber <= lastNumber) {

			product = product * firstNumber;

			firstNumber++;
		}

		return product;

		// System.out.println("The sum of all Number from 9 to 888 is: " +
		// product);
		// System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sum number from 9 to 888

		int firstNumber = 9, lastNumber = 888;
		int sum = 0;

		while (firstNumber <= lastNumber) {

			sum = sum + firstNumber;

			firstNumber++;
		}

		System.out.println("The sum of all Number from 9 to 888 is: " + sum);
		System.out.println();

		// sum of odd number from 1 to 1000
		firstNumber = 1;
		lastNumber = 1000;
		sum = 0;

		while (firstNumber <= lastNumber) {

			sum = sum + firstNumber;

			firstNumber = firstNumber + 2;
		}

		System.out.println("The sum of all odd Number from 1 to 1000 is: " + sum);
		System.out.println();

		// sum of all Number divisible by 7 between 1 to 1000

		firstNumber = 7;
		lastNumber = 1000;
		sum = 0;

		while (firstNumber <= lastNumber) {

			sum = sum + firstNumber;

			firstNumber = firstNumber + 7;
		}

		System.out.println("The sum of all Number divisible by 7 between 1 to 1000 is: " + sum);
		System.out.println();

		// sum of the square of all the numbers from 1 to 100

		firstNumber = 1;
		lastNumber = 100;
		sum = 0;

		while (firstNumber <= lastNumber) {

			sum = sum + (firstNumber * firstNumber);

			firstNumber = firstNumber + 1;
		}

		System.out.println("The sum of the square of all the numbers from 1 to 100 is: " + sum);
		System.out.println();

		// product of number betwee 1 to 10
		RunningNumberSum prod = new RunningNumberSum();

		System.out.println("product of number betwee 1 to 10: " + prod.RunningNumberProduct());
		System.out.println();

		// sum all the integers between 1 and 1000, that are divisible by 13, 15
		// or 17, but not by 30.

		firstNumber = 1;
		lastNumber = 1000;
		sum = 0;
		int number = firstNumber;

		while (number <= lastNumber) {
			if ((number % 13 == 0 || number % 15 == 0 || number % 17 == 0) && (number % 30 != 0)) {

				sum = sum + number;

			}
			number++;
		}

		System.out.println(
				"The sum all the integers between 1 and 1000, that are divisible by 13, 15 or 17, but not by 30 is: "
						+ sum);
		System.out.println();

		firstNumber = 1;
		lastNumber = 1000;
		sum = 0;
		int year = firstNumber;
		System.out.println("Follwling are the leap year between AD1 to AD1000: ");

		while (year <= lastNumber) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

				System.out.print(year + " ");
				sum++;

			}
			++year;
		}
		
		System.out.println();
		System.out.println("The number of leap year between AD1 to AD1000 is: " + sum);
		System.out.println();
		
		
		 firstNumber=11;
		 lastNumber=8899;
		int count=0;
		sum=0;
		
		do{
			sum+=firstNumber;
			firstNumber++;
			count++;
		}while(firstNumber<=lastNumber);
		
		
		System.out.println("The sum is: " +sum);
		System.out.println("The count is "+count);
		double avarage;
		
		avarage=(double)sum/count;
		
		System.out.println("The avarage is: "+avarage);
		
		 
		
				

	}

}
