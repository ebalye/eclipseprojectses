package ebalye;

import java.util.Scanner;

public class Recursion {
	public static void main(String []args) {
		
		int choice;
		int factor;
		Scanner Scan = new Scanner(System.in);
		System.out.println("choose from the following:");
		System.out.println("1. factorial");
		System.out.println("2. summation");
		System.out.println("3. Fibonacci");
		System.out.println("4. Exit");
		System.out.println("Enter choice");
		 choice = Scan.nextInt();
	
		 		if (choice<=3) {		 	
		 			switch(choice) {
		 			
		 				
		 			case 1:
		 					public static void factorial() {
		 						System.out.println("Enter a number");
		 						long n = Scan.nextInt();
		 						System.out.print(factorial(5));
		 						}
		 					
		 					public static int factorial(int n) {
		 					if(n==1){
		 					return 0;
		 					
		 					}else {
		 						
		 						
		 						return n*(n-1);		
		 					}
		 				
		 							
		 			}
		 			}
		 		}else {
		 			System.out.print("exit");
		 			  }
		 
		 		
		 		
		 		
		 		
		 
											}
						}
