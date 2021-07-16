package algorithms;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test {

	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=(n-i); j++)
			{
				System.out.print(" ");	
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");	
			}
			for(int j=2; j<=i; j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		
	
		
	
	}
	 
	 
}
