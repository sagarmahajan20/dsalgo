package array;

public class insertionsort {

	public static void main(String[] args) {
		int a[] = {6,5,4,3,2,1};
		int n = 6;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j>0; j--)
			{
				if(a[j]<a[j-1])
				{
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
