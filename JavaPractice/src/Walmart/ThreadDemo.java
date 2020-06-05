package Walmart;

public class ThreadDemo implements Runnable 
{
	public void run() 
	{ 
		System.out.printf("%d",3); 
	} 


	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ThreadDemo()); 
		thread.start(); 
		System.out.printf("%d",1); 
		thread.join(); 
		System.out.printf("%d",2); 


	}

}
