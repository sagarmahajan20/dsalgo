package graph;
import java.util.*;
import java.lang.*;
import java.io.*;
public class dfscycle {

static ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
	
	public static void main(String[] args) 
	{
	
		int n = 9; 
		
		for (int i = 0; i <= n; i++) 
			adj.add(new ArrayList<Integer>());
		
		// edge 1---2
		adj.get(1).add(2); 
		adj.get(3).add(4);
		adj.get(2).add(3);
		adj.get(3).add(6);
		adj.get(4).add(5);
		adj.get(6).add(5);
		adj.get(7).add(2);
		adj.get(7).add(8);
		adj.get(8).add(9);
		adj.get(9).add(7);
		System.out.println("Representation of Graph"); 
		System.out.println(adj); 
		System.out.println(); 
		boolean vis[] = new boolean[10];
		boolean restac[] = new boolean[10];
		
 
		
		  for(int i = 1;i<=n;i++) 
		  {
	            if(dfscycle(i, vis,restac)) 
	            	System.out.println("true");
	           
	      }
		  
          	System.out.println("False");
	}
	
	public static boolean dfscycle(int v,boolean vis[],boolean restac[])
	{
		
		if(restac[v] == true)
			return true;
		if(vis[v] == true)
			return false;
	
		restac[v] = true;
		vis[v] = true;
		
		for(Integer it:adj.get(v))
		{
			
			if(dfscycle(it, vis,restac) == true)
			{ 
				return true;
			}
			
			
			
		}
		
		
		restac[v] = false;
		return false;
	}
}
