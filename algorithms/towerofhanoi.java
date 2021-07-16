package algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class towerofhanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		
		tow(n,A,B,C);
		
	}

	public static void tow(int n,int A, int B, int C)
	{
		if(n==0)
		{
			return;
		}
		
		tow(n-1,A,C,B);
		System.out.println(n + ": "+ A + "-> "+B);
		tow(n-1,C,B,A);
		
		
	}
	
}
