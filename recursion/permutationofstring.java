package recursion;

public class permutationofstring {

	public static void main(String[] args) 
	{
		String in = "ABC";
		
		permu(in,"");
	}

	public static void permu(String a, String ans) 
	{
		if(a.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<a.length(); i++)
		{
			char ch = a.charAt(i);
			String ros = a.substring(0,i)+a.substring(i+1);
			permu(ros,ans+ch);
		}
		
		
		
	}
	
}
