package recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class remdupli 
{

	public static void main(String[] args) 
	{
	
		String in = "aaaabbbeeedcccc";
		
		
		
		System.out.println(removeDups(in));
	}
	//String out = "";
	public static String removeDups(String s)
	{
	    if ( s.length() <= 1 ) 
	    	return s;
	    
	    if( s.substring(1,2).equals(s.substring(0,1)) ) 
	    	return removeDups(s.substring(1));
	    else
	    	return s.substring(0,1) + removeDups(s.substring(1));
	}

	
}
