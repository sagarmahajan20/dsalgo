package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class test2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int f_no = sc.nextInt();
		int r_no = sc.nextInt();
		
		for(int i=1; i<=r_no; i++)
		{
			for(int j=1; j<(r_no-i-1); i++)
			{
				System.out.print(" ");
			}
			
			
			for(int j=1; j<(2*i-1); j++)
			{
				System.out.print(f_no);
				f_no = f_no+4;
				
			}
			System.out.println();
		}
		
		

	}

}
