package cc;

import java.util.Scanner;

public class recursion 
{

	 public static int fibonacci(int n) 
	 {
	        // Complete the function.
		 if( n > 1)
	        return fibonacci(n - 1) + fibonacci(n - 2);
		 else
	       return n;
		   
	 }

	 public static void main(String[] args) 
	 {
	        
		    Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();
	        System.out.println(fibonacci(n));
     }
	
}
