package bitmanipul;

public class subsetofset {

	public static void main(String[] args) 
	{
	
		int arr[] = {1,2,3};
		int n =arr.length;
		
		for(int i=0;i<(1<<n); i++)
		{
			for(int j=0; j<n; j++)
			{
				int a = i & (1<<j);
				if( a > 0)
				{
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
