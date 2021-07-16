package gcd;

import java.util.Scanner;

public class gcdusingeuclidean {

	public static void main(String[] args) 
	{
		int a = 24; // 24 = 2 *2 *2 *3
		int b = 42;// 42 = 2 *2


		int n=0;
		int c=0;
		while(b!=0)
		{
			c = a%b;
			a = b;
			b=c;
		}
		System.out.println("b"+a);
		
		// TODO Auto-generated method stub

	}

}
