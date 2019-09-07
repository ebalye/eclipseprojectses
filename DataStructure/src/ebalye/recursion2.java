package ebalye;

import java.math.BigInteger;
import java.util.Scanner;

public class recursion2 {
	public static void main(String []args) {
	
		int choice;
		int factor;
		long result;
		Scanner Scan = new Scanner(System.in);
		System.out.println("choose from the following:");
		System.out.println("1. factorial");
		System.out.println("2. summation");
		System.out.println("3. Fibonacci");
		System.out.println("4. Exit");
		System.out.println("Enter choice");
		 choice = Scan.nextInt();
		 		if (choice<=3) {	
		 			System.out.println("Enter a number");
					long num = Scan.nextInt();
		 			switch(choice) {	
		 			case 1: String s = factorial(num,"1");
		            System.out.println("Factorial is " + s);
		 			break;	
		 			
		 			case 2:System.out.println("Sum of " +num + "is " + summation(num));
		 			break;
		 			case 3: 	
		 				System.out.println(fibonacci(num));
		 				
		 		
		 							}
		 		}else {
		 			System.out.print("exit");
		 			  }
						}
	  public static String factorial(long num,String s){
	        if(num>0){
	            BigInteger fact = new BigInteger(s);
	            fact = fact.multiply(new BigInteger(num + ""));
	            return factorial(num-1,fact.toString());
	        }
	        else{
	            return s.toString();
	        }
	    }
	
	public static long fibonacci(long num){
		if(num == 1 || num == 2){
            return 1;
        }
      
        return fibonacci(num-1) + fibonacci(num -2); 
    }
			
		
		
		
	public static long summation(long num) {
		if (num==0) { return 0;
	}else{
		return (num+summation(num-1));
		
		
	}
			
		}
			
		
}
						
