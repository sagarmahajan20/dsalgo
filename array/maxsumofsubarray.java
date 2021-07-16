package array;

public class maxsumofsubarray {

	public static void main(String[] args) 
	{
		int a[] = {2,-1,6,4,2};
		int n=5;

		int sum= 0;
		int max = a[0];
		
		for(int i=0; i<n; i++)
		{
			sum += a[i];
			
			if(sum >max)
			{
				max = sum;
			}
			
			if(sum<0)
			{
				sum=0;
			}
			
		}
		
		System.out.println(max);
		
	}

}
