package recursion;

public class gensubstring {

	public static void main(String[] args) {
		String in = "ABC";
		gens(in,"");

	}

	static String out = "";
	public static void gens(String s,String ans)
	{
		if(s.length() == 0)
		{
			System.out.println(ans);
			return ;
		}
		
		gens(s.substring(1),ans);
		gens(s.substring(1),s.charAt(0)+ans);
		
	}

}
