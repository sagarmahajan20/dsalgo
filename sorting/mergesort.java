package sorting;

public class mergesort 
{

	public static void main(String[] args) 
	{
		
		int arr[] = {5,4,3,2,1};
		
		mergesort(arr,0,4);
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	
	public static void mergesort(int arr[],int l,int r)
	{
		
		
		if(l<r)
		{
			int mid = (l+r)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			merge(arr,mid,l,r);
		}
		
		
	}
	
	public static void merge(int arr[],int mid,int l,int r)
	{
		
		int n1 = mid-l+1;
		int n2 = r-mid;
		int a[] = new int[n1];
		int b[] = new int[n2];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = arr[l+i];
		}
		for(int i=0; i<b.length; i++)
		{
			b[i] = arr[mid+i+1];
		}
		
		int i =0;
		int j =0;
		int k =l;
		
		while(i<n1 & j<n2)
		{
			if(a[i]<b[i])
			{
				arr[k] = a[i];
				k++;
				i++;
			}
			else
			{
				arr[k] = b[j];
				k++;
				j++;
			}
			
		}
		while(i<n1)
		{
			arr[k] = a[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k] = b[j];
			k++;
			j++;
		}
	}
	
	
}
