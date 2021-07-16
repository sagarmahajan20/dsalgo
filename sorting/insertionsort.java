package sorting;

public class insertionsort {

	/*
	    Step 1 − If it is the first element, it is already sorted. return 1;
		Step 2 − Pick next element
		Step 3 − Compare with all elements in the sorted sub-list
		Step 4 − Shift all the elements in the sorted sub-list that is greater than the 
		         value to be sorted
		Step 5 − Insert the value
		Step 6 − Repeat until list is sorted
	 
	 */
	
	
	public static void main(String[] args) 
	{
		int arr[] = {14,33,27,35,10};
		int n = 5;
		insertionsort(arr,n);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

	public static void insertionsort(int arr[],int n)
	{
		int temp;
		int j;
		for(int i=1; i<n; i++)
		{
			 temp = arr[i];
			j=i-1;
			while(j>=0 && temp<=arr[j])
			{
				arr[j+1] = arr[j];
				j = j-1;
					
			}
			   arr[j+1] = temp;  
			
		}
		
	}
	
	
}
