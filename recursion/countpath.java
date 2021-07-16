package recursion;

public class countpath {

	public static void main(String[] args) 
	{
		int s=0;
		int e=3;
		System.out.println(numofways(s,e));
	}

	public static int numofways(int s, int e) 
	{
		if(s==e)
		{
			return 1;
		}
		if(s>e)
		{
			return 0;
		}
		
		int totalpath = 0;
		
		for(int i=1; i<=6; i++)
		{
			totalpath +=numofways(s+i,e);
		}
		
		return totalpath;
	}
	
	
}
