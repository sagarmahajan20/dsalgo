package sorting;

public class bubblesort {

	public static void main(String[] args) 
	{
		int arr[] = {14,33,27,35,10};
		int n = arr.length;
		bubblesort(arr,n);
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}


	}
	
	public static void bubblesort(int arr[],int n)
	{
	
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<(n-i-1); j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
		}
		
	}
	
	

}
