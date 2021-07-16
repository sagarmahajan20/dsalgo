package cc;

import java.util.Scanner;

public class quicksortrecur 
{

	 public static int quick(int[] arr, int size,int u, int p, int q) 
	 {
		
		 System.out.println(size);
		  return 0;
	 }

	 public static void main(String[] args) 
	 {
	        
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] arr = new int[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	         arr[i] = sc.nextInt();
	      }
	        
	        int u = arr[0];
			int p = arr[1];
			int q = arr[size - 1];
	       quick(arr,size,u,p,q);
     }
	
	
	
}
