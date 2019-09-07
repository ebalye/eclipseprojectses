package ebalye;
import java.math.BigInteger;
import java.util.Scanner;
public class Iteration {
	public static void main(String[] args) {
		BigInteger factor = new BigInteger("1");
		int choice;
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("choose from the following:");
		System.out.println("1. factorial");
		System.out.println("2. summation");
		System.out.println("3. Fibonacci");
		System.out.println("4. Exit");
		System.out.println("Enter choice");
		 choice = Scan.nextInt();
			if(choice <= 3){
				
				System.out.println("Enter a number");
				long num = Scan.nextInt();
				
					switch(choice) {
						case 1:     BigInteger fact= BigInteger.valueOf(1);

			            for(int i1=1;i1<num-1;i1++)
			            {
			                fact = fact.multiply(BigInteger.valueOf(num - 1));
			            }
			            System.out.print("Factorial is "+fact);
									break;
									
						case 2:  long sum =0,i;
							for(i = 1;i<=num; i++){    
								sum= sum + i;
	      
								}    
						System.out.println("Summation of "+num+" is: " + sum);   
	  
								break; 
								
						case 3:   
							long a = 0, b=1,c;
						for (int i1 = 0; i1<num; i1++)
				        {
				            System.out.print(a+" ");
				            	c=a+b;
				            	a=b;		
				            	b=c;
				            
				        }
							
						break;
									
									}	
						}else{
										System.out.println("exit");
			}
	}
}
