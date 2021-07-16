package backtracking;

import java.util.ArrayList;

public class nqueen {

	static ArrayList<Integer> l = new ArrayList<Integer>();
	
	public static void main(String[] args) 
	{
	
		
		int a[][] = new int[4][4];
		
		int n=4;
		if(nq(a,0,n) )
		{ 
			for(int col = 0; col<4; col++)
			{
				for(int col1 = 0; col1<4; col1++)
				{
					System.out.print(a[col][col1]);
				}
				System.out.println();
			}
		}
	
		System.out.println(1);
	}

	
	public static boolean nq(int a[][],int x,int n)
	{
		
		if(x>=n)
		{
			return true;
		}
	
		for(int col = 0; col<n; col++)
		{
			if(issafe(a,x,col,n))
			{
				a[x][col] = 1;
				
				if(nq(a,x+1,n))
				{
					return true;
				}
				a[x][col] = 0;
			}
			
			
		}
		
		return false;
	}
	
	public static boolean issafe(int a[][],int x, int y,int n)
	{
		for(int row = 0; row<x; row++)
		{
			if(a[row][y] == 1)
			{
				return false;
			}
		}
		
		int row =x;
		int col = y;
		
		while(row>=0 & col>=0)
		{
			if(a[row][col] == 1)
			{
				return false;
			}
			row--;
			col--;
		}
		
		row =x;
		col = y;
		
		while(row>=0 & col<n)
		{
			if(a[row][col] == 1)
			{
				return false;
			}
			row--;
			col++;
		}
		
		
		return true;
	}
	
}
