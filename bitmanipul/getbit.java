package bitmanipul;

public class getbit 
{

	public static void main(String[] args)
	{
	
		int a = 5;
		
		System.out.println(getbitofnum(a,2));
	}
	
	private static boolean getbitofnum(int a, int pos)
	{
		return ((a & (1<<pos)) != 0);
	}

}
