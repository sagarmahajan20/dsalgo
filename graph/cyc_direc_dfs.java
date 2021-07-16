package graph;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;
public class cyc_direc_dfs 
{
	/*
	 Input
	 1
		10 10
		1 2
		2 3
		3 4
		4 5
		3 6
		6 5
		7 2
		7 8
		8 9
		9 7
	 *
	 *
	 *
	 */
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(isCyclic(V, list) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
   
	private static boolean checkCycle(int node,  ArrayList<ArrayList<Integer>> adj, int vis[], int dfsVis[]) 
	{
        vis[node] = 1; 
        dfsVis[node] = 1; 
        
        for(Integer it: adj.get(node)) 
        {
            if(vis[it] == 0) 
            {
                if(checkCycle(it, adj, vis, dfsVis) == true) 
                {
                    return true; 
                }
            }
            else if(dfsVis[it] == 1) 
            {
                return true; 
            }
        }
        dfsVis[node] = 0;
        return false; 
    }
	
    public static boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj) 
    {
        int vis[] = new int[N]; 
        int dfsVis[] = new int[N]; 
        
        for(int i = 0;i<N;i++) 
        {
            if(vis[i] == 0) 
            {
                if(checkCycle(i, adj, vis, dfsVis) == true) return true; 
            }
        }
        return false; 
    }

}
