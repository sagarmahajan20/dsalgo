package recursion;

public class arrsorted 
{
	//static int k=0;
	public static void main(String[] args) 
	{
	
		int arr[] = {1,2,3,4,5,6};
		
		System.out.println(arrsor(arr,6));
	}

	public static boolean arrsor(int arr[], int n)
	{
		if(n==1)
		{
			return true;
		}
		
			int a[] = new int[n-1];
			for(int i=0; i<n-1; i++)
			{
				a[i] = arr[i+1]; 
			}
			boolean restArray = arrsor(a,n-1);
				System.out.println("My code output is ");
		
		return (arr[0]<arr[1] && restArray);
	}
	
}
