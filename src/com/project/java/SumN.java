package com.project.java;

public class SumN {

	public static void main(String[] args) {
		
		
		System.out.println(sumn(10));

	}
	
	
	public static int sumn(int n){
		
		if (n==1) {
			return 1;
		}
		return(sumn(n-1)+n);

		
	}

}
