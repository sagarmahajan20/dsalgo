package cc;

import java.util.Arrays;
import java.util.Scanner;

public class Hackerearth {
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT*/

      
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();                   // Writing output to STDOUT

        int arr[] = new int[num];
        
        for(int i=0; i<num; i++)
        {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr); 
        int sum =0;
        for(int i=1; i<num; i=i+4)
        {
            sum = sum+arr[i]; 
        }

        System.out.print(sum);
        
        
    }
}
