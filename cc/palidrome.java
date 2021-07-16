package cc;

public class palidrome 
{

	public static void main(String[] args) 
	{
		int x=121;
		
        if(x < 0 || (x % 10 == 0 && x != 0)) 
        {
           System.out.print(false);
        }

        int cn = 0;
        while(x != 0) {
            cn = cn * 10 + x % 10;
            x /= 10;
        }

        
        System.out.print(x == cn );
    
	        
		
		
	}
	
}
