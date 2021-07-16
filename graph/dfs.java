package graph;

import java.util.*;
import java.lang.*;
import java.io.*;

public class dfs {

	static ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
	
	public static void main(String[] args) 
	{
	
		int n = 7, m = 7; 
		
		for (int i = 0; i <= n; i++) 
			adj.add(new ArrayList<Integer>());
		
		// edge 1---2
		adj.get(1).add(2); 
		

		// edge 2---3
		
		adj.get(3).add(5);
		
		// edge 2---1
		adj.get(2).add(1);
		
		
		// adge 2--7
		adj.get(2).add(4);
		adj.get(2).add(7);
		adj.get(4).add(2);
		
		adj.get(4).add(6);
		adj.get(5).add(3);
		adj.get(6).add(4);
		adj.get(6).add(7);
		adj.get(7).add(2);
		adj.get(7).add(6);
		System.out.println("Representation of Graph"); 
		System.out.println(adj); 
		System.out.println(); 
		boolean vis[] = new boolean[8];
		
		  for(int i = 1;i<=m;i++) {
	            if(!vis[i]) 
	            	dfs(i, vis); 
	        }
	}
	
	public static void dfs(int v,boolean vis[])
	{
	
		vis[v] = true;
		System.out.print(v+" ");
		
		for(Integer it: adj.get(v)) {
            if(vis[it] == false) {
                dfs(it, vis); 
            }
        }
		
		return;
	}
	
}
