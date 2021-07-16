package bitmanipul;

public class powerof2 {

	public static void main(String[] args) 
	{
	
		int n = 57;
		int a = n & n-1;
		if( a == 0)
		{
			System.out.println(n+" is power of 2");
		}
		else
		{
			System.out.println(n+" is not power of 2");
		}
	
	}

}
