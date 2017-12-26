package com.project.java;

public class Tribonacci {

	public static void main(String[] args) {
		
		Tribonacci aTribonacci = new Tribonacci();
        aTribonacci.printAndAvarageTribonacii(20);
		
	}
		// TODO Auto-generated method stub
		
		//1 1 2 4 7 13
		
		private void printAndAvarageTribonacii(int n){
			
			
			double tb1 = 1;
			double tb2 = 1;
			double tb3 = 2;
			double tbn=1;
			double sum=0;
			
			
			if (n<=0) {
				
				System.out.println("Please dont' do this");
				
			}
			
			for(int i=1;i<=n;i++){
				
				switch (i) {
				case 1:
					tbn=tb1;
					break;
				case 2:
					tbn = tb2;
					break;
				case 3 :
					tbn = tb3;
				

				default:
					tbn = tb1+tb2+tb3; /// 0 = 0+2+2, 2+2  4
					tb1=tb2;
					tb2=tb3;
					tb3=tbn;
					
				}
				
				sum+=tbn;
				System.out.print(tbn + " ");
			}
			 System.out.println(); 
		        System.out.printf("The sum is %1$f \n", sum);
		        System.out.printf("The average is %.4f \n", (double)sum / n);
		}

	}


