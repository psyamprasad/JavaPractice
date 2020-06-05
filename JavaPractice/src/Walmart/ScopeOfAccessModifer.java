package Walmart;

public class ScopeOfAccessModifer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ScopeOfAccessModifer.Nested inner = new ScopeOfAccessModifer.Nested(); 
		inner.display();	

	}
	
	private static int value = 20; 
	public int s = 15; 
	public static int temp = 10; 
	public static class Nested 
	{ 
	private void display() 
	{ 
		//System.out.println(temp + s + value); 
	} 
	} 


}
