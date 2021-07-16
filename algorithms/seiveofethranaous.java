package algorithms;

public class seiveofethranaous 
{

	public static void main(String[] args) 
	{
		int arr[] = new int[101];
		
		for(int i=2; i<=100; i++)
		{
			if(arr[i] ==0)
			{
				for(int j=i*i; j<=100; j+=i)
				{
				    arr[j] = 1;
				}
			}
		}
		
		for(int i=2; i<=100; i++)
		{
			if(arr[i] == 0)
			{
			System.out.println(i);	
			}
		}
		
	}

}
