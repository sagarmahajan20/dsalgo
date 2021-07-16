package sorting;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,45,23,51,19,8};
		int n = 5;
		selectionsort(arr,n);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

	public static void selectionsort(int arr[],int n)
	{
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		
			
			
		}
		
	}
	
	
}
