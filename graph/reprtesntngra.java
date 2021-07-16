package graph;

import java.util.ArrayList;

public class reprtesntngra {

	public static void main(String[] args) 
	{
	
		int n = 3, m = 3; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		
		for (int i = 0; i <= n; i++) 
			adj.add(new ArrayList<Integer>());
		
		// edge 1---2
		adj.get(1).add(2); 
		adj.get(2).add(1);
		

		// edge 2---3
		adj.get(2).add(3);
		adj.get(3).add(2);
		
		
		// adge 1--3
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		adj.get(0).add(3);
		adj.get(3).add(0);
		
		System.out.println("Representation of Graph"); 
		System.out.println(adj); 
	
		
		
	

	}

}
