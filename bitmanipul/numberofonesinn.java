package bitmanipul;

public class numberofonesinn {

	public static void main(String[] args) 
	{
		int n = 19; //01011
		int count = 0;
		while(n!=0)
		{
			int a = n&n-1;
			n=a;
			count++;
		}
		System.out.println("Total number of ones : "+count);
	}

}
