package recursion;

public class revstring {

	public static void main(String[] args) 
	{
	
		String in ="sagar";	
		System.out.println(rev(in));
	}
	static String out = "";
	public static String rev(String s)
	{
	    if ( s.length() == 0 ) 
	    	return s;
	    
	    rev(s.substring(1));
	    
	    out += s.charAt(0);
	    
	    return out;
	
	}

}
