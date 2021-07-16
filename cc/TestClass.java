package cc;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

    



    public static void main(String args[] ) throws Exception 
    {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

         Scanner str = new Scanner(System.in);
        int t= str.nextInt();
        
	    while(t!=0)
	    {
	        	int len = str.nextInt();
	        	//String name = str.next();                 // Reading input from STDIN
	            //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	
	            
	            int[] ch = new int[len]; 
	            
	            
	            int soa = 0; 
	    		
	    		for(int i=0; i<len; i++)
	    		{
	    			soa = soa +ch[i];
	    		}
	    		
	            //int sum = sumofarray(ch,len);
	            int ans =0;
	            while(soa == -1*len)
	            {
	            	
	            	for(int i=0; i<len; i++)
	            	{
	            		if(ch[i] == 0)
	            		{
	            			for(int j=i+1; j<len; j++)
	                    	{
	            				if(ch[j] == 1)
	                    		{
	            					ch[j] = -1;
	            					ch[i] = -1;
	                    		}
	                    	
	                    	
	                    	}
	            			
	            			
	            		}
	            		ans++; 
	            		
	            	}
	            	//soa = sumofarray(ch,len);
	            	soa = 0; 
		    		
		    		for(int i=0; i<len; i++)
		    		{
		    			soa = soa +ch[i];
		    		}
	            	 
	            	
	            	
	            }
	            System.out.println(ans);
	    
	            t--;
	    }        
	            
	            

    }
    
    
    static int sumofarray(int arr[], int size)
	  {
	
		int soa = 0; 
		
		for(int i=0; i<size; i++)
		{
			soa = soa +arr[i];
		}
		
		return soa;
	  }
    
}
