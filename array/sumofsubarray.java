package array;

import java.util.Arrays;

public class sumofsubarray {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,8};
		int n=4;
		int target = 5;
		
		int st =-1,en=-1,sum=0, i=0,j=0;
		
		while(j<n && sum+a[j]<=target)
		{
			sum+=a[j];
			j++;
		}
		
		if(sum == target)
		{
			System.out.print(i+1 +" "+j);
			return ;
				
		}
		System.out.print(j+"j");
		while(j<n)
		{
			sum+=a[j];
			while(sum>target)
			{
				sum-=a[i];
				i++;
			}
			
			if(sum == target)
			{
				st = i+1;
				en = j+1;
				break;
					
			}
			j++;
			
		}
		System.out.print(st +" "+en);

	}

}
