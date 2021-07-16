package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class test1 
{

	public static void main(String[] args) 
	{

		Scanner sc  = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i=0; i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		int f_lar =  Integer.MIN_VALUE;
		int s_lar = Integer.MIN_VALUE;
		for(int i=0; i<size;i++)
		{
			f_lar = Math.max(f_lar, arr[i]);
		}
		
		for(int i=0; i<size;i++)
		{
			if(arr[i] != f_lar)
				s_lar = Math.max(s_lar, arr[i]);
		}
		
		
		if(size<2)
		{
			System.out.println(-1);
		}
		else if(s_lar == Integer.MIN_VALUE)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(s_lar);
		}
		
		
		
	}

}
