package bitmanipul;

public class setbit {

	public static void main(String[] args)
	{
	
		int a = 5;
		
		System.out.println(getbitofnum(a,1));
	}
	
	private static int getbitofnum(int a, int pos)
	{
		int m = a |  (1<<pos);
		return m;
	}
}
