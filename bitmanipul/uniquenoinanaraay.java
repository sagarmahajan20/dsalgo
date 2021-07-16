package bitmanipul;

public class uniquenoinanaraay {

	public static void main(String[] args) 
	{
	
		int arr[] = {2,4,6,3,4,6,2};
		int xosum = 0;
		//output = 3
		// xor of any two number is always zero
		int n=7;
		for(int i=0; i<n; i++)
		{
			xosum^=arr[i];
		}
		
		System.out.println("Unique number in an array is : "+ xosum);
	}

}
