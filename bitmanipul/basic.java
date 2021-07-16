package bitmanipul;

public class basic {

	public static void main(String[] args) 
	{
		// Initial values
        int a = 5;
        int b = 7;
 
        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        //  0100 
        //^ 0010=0110
        System.out.println( 0101 ^ 0111);
 
        // bitwise not
        // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);
 
        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);

	}

}
/*
int n=s.nextInt();
        int k=s.nextInt();
        String str=s.nextLine();
        String su = "";
        for(int i=0; i<k; i++)
        {
            su  = su + '*';
        } 
        if(str.contains(su))
            System.out.println("Yes");
		else 
		    System.out.println("No");
 */