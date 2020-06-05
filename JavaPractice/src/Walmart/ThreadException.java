package Walmart;

public class ThreadException implements Runnable 
{
	public void run() 
	{ 
		System.out.printf("GFG "); 
		System.out.printf("Geeks "); 
	} 


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ThreadException obj = new ThreadException(); 
		Thread thread = new Thread(obj); 
		
		thread.start(); 
		System.out.printf("Geeks "); 
		try
		{ 
			thread.join(); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		System.out.println("for "); 


	}

}
