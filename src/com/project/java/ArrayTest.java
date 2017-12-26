package com.project.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void printArray(int[] arra) {

		System.out.println(arra.length);
		for (int i = 0; i < arra.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print("a" + arra[i]);
		}

	}

	public int[] input() {

		int[] array = new int[4];
		Scanner in = new Scanner(System.in);
		for (int j = 0; j < array.length; j++) {
			System.out.println("Enter the array elements: ");
			array[j] = in.nextInt();
		}

		in.close();
		return array;

	}
	
	public static String arrayToString(int[] array){
		String res = Arrays.toString(array);
		return res;		
	}
	
	public static boolean contains(int[] array, int key){
		boolean b=false;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]==key) {
				b=true;
			}
			
		}
		return  b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest ab = new ArrayTest();
		// printArray ac = new printArray(int[] arrays);
		//ab.printArray(ab.input());
		ArrayTest.printArray(ab.input());
		//System.out.println(ArrayTest.arrayToString(ab.input()));
		//System.out.println(ArrayTest.contains(ab.input(), 5));

	}

}
