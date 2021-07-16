package bitmanipul;

public class twouniquenoinarray 
{

	private static int getbitofnum(int a, int pos)
	{
		int m = a &  (1<<pos);
		System.out.println("m"+m);
		return m;
	}
	
	
	public static void main(String[] args) 
	{
	
		int arr[] = {2,4,6,3,7,4,6,2};
		int xosum = 0;
		//output = 3
		// xor of any two number is always zero
		int n=8;
		for(int i=0; i<n; i++)
		{
			xosum=xosum^arr[i];
		}
		int temxor = xosum;
		int setbit =0;
		int pos =0;
		while(setbit!=1)
		{
			setbit = xosum &1;
			pos++;
			xosum = xosum>>1;
		}
		
		int newxor = 0;
		for(int i=0; i<n; i++)
		{
			//imp 
			if(getbitofnum(arr[i],pos-1)> 0)
			{
				newxor = newxor ^arr[i];
			}
		}
		
		System.out.println("1st Unique number in an array is : "+ (temxor^newxor));
		System.out.println("2nd Unique number in an array is : "+ newxor);
	}

}
