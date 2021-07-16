package recursion;

public class movextrig {

	public static void main(String[] args) 
	{
		String in = "axxbdxcefxhix";
		System.out.println(movex(in));

	}

	static String out = "";
	public static String movex(String s)
	{
		
		if(s.length() == 1)
			return "";
		
		if(s.charAt(0) == 'x')
		{
			return movex(s.substring(1))+ "x";
		}
			
			
	    return s.charAt(0)+ movex(s.substring(1));
		
	}
	
}
