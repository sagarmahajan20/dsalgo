package cc;

public class reversenum {

	public static void main(String[] args) 
	{
		int x = -123;
		
		int rev =0;
        if(x > 0)
		{
			 while (x != 0) {
		            int pop = x % 10;
		            x /= 10;
		           rev = rev * 10 + pop;
		        }
		     //return rev;
			
		}
		else
		{
			
			  while (x != 0) {
		            int pop = x % 10;
		            x /= 10;
		           rev = rev * 10 + pop;
		        }
             rev = -rev;
             System.out.print(-rev);
		     //return rev;
		}
		
		
	}

}
