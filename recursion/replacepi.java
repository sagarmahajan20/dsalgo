package recursion;

public class replacepi {

	public static void main(String[] args) 
	{
	
		String in = "pippxpipxpi";
		System.out.println(removepi(in));
	}
	String out = "";
	public static String removepi(String s)
	{
	    if ( s.length() <= 1 ) 
	    	return s;
	   
	    char i = 'i';
	    char p = 'p';
	    if(s.charAt(0) == p && s.charAt(1) == i)
	    {
	    	return 3.14 + removepi(s.substring(2));
	    }
	    else
	    {
	    	return s.charAt(0) +removepi(s.substring(1));
	    }
	    
	   
	}
}
