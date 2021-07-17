package top_100_que;

import java.util.Scanner;

public class leap_year 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if( (year%4==0 && year%100 == 0 ) || (year%400 == 0) )
			System.out.println(year +" is Leap Year");
		else
			System.out.println(year+ " is not a Leap Year");
		
		
	}

}
