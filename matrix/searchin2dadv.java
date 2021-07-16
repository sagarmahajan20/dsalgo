package matrix;

public class searchin2dadv {

	public static void main(String[] args) 
	{
		int[][] a = {
			      {1, 2, 3}, 
			      {4, 5, 6}, 
			      {7, 8, 9} 
			};
		
		
		int n=3;
		
		int target=8;
		int i=0;
		int j=n-1;

		while(i<n &&j>=0)
		{
			if(a[i][j] == target)
			{
				System.out.println("i:" +i+", j: "+j);
				break;
			}
			else if(target>a[i][j])
			{
				i++;
			}
			else
			{
				j--;
			}
			
		}

		
		
	}

}
