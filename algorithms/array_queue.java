package algorithms;

public class array_queue 
{
	
	public static void insert(int data)
	{
		
		if(size == back)
		{
			System.out.println("No space left");
			
		}
		else
		{
			arr_queue[back] = data;
			back++;
		}
		
		
		
	}

	public static void pop()
	{

		if(front == back)
		{
			System.out.println("Queue is Empty");
			return;
		}
		else
		{
			for(int i=0; i<back-1; i++)
			{
				arr_queue[i] = arr_queue[i+1];
			}
			
			
			if(back < size)
			{
				arr_queue[back] = 0;
			}
			
			back--;
			
		}
		
	}
	
	public static void isEmpty()
	{
		
		if(front == back)
		{
			System.out.println("Queue is empty");
		}
		
		
	}
	
	static int front =0;
	static int back = 0; 
	static int size;
	static int arr_queue[];
	
	public static void main(String[] args) 
	{
		
		

	}

}
