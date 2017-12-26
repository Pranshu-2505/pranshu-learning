package com.project.java;

public class ArrayMaxMinAvg {

	public static void main(String[] args) {
		
		  int[] number = {1,2,3,8,5,6};
		  System.out.println(ArrayMin(number));

	}
	
	public static double ArrayAvg(int[] n){
		
		int sum =0;
		for (int i = 0; i < n.length; i++) {
			sum=sum + n[i];
		}
		
		return (sum/(n.length));
	}
	
	public static int ArrayMax(int[] n){
		
		int max = n[0];
		
		for (int i = 1; i < n.length; i++) {
			if(max>n[i]){
				return max;
			}
			else{
				max=n[i];
			}
			
		}
		
		return max;
	}
	
	
public static int ArrayMin(int[] n){
		
		int min = n[0];
		
		for (int i = 1; i < n.length; i++) {
			if(min<n[i]){
				return min;
			}
			else{
				min=n[i];
			}
			
		}
		
		return min;
	}

}
