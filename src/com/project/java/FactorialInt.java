package com.project.java;

public class FactorialInt {
	
	
	static int Factorial(int n){
		
		if(n==0){
			return 1;
		}else {
			return(n*Factorial(n-1));
		}
			
	}
	
	static void Factorial1to10(){
		
		int i=1;
		while(i<=20){
			System.out.println(Factorial(i));
			i++;
		}
	}
	
	static void FactorialOver(){
		int i=1;
		
		//System.out.println(Factorial(n));
		while(Integer.MAX_VALUE/Factorial(i)>1){
			System.out.println("The factorial of" +i +"is" +Factorial(i));
				System.out.println("The factorial of" +i +"is out of range");
				i++;
			}
		System.out.println("The factorial of" +i +"is out of range");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FactorialInt.Factorial1to10();
		//FactorialInt.FactorialOver();
		
		System.out.println(Factorial(1));

	}

}
