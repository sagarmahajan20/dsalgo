package matrix;

public class transpose {

	public static void main(String[] args) 
	{
		int[][] a = {
			      {1, 2, 3}, 
			      {4, 5, 6}, 
			      {7, 8, 9} 
			};
		
		
		int n=3;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
					int temp =a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
			
			}
		
		}
	
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}	
	
	}

}
