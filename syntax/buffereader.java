package syntax;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class buffereader {

	public static void main(String[] args) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int sagar = Integer.parseInt(br.readLine());
		//String name = br.readLine();		
		
		//System.out.println(sagar);
		//System.out.println(name);
		
		//int T = Integer.parseInt(br.readLine().trim());
		//System.out.println(T);
		
		 String[] s = br.readLine().trim().split(" ");
		 System.out.println(s);
		
		
	}

}
