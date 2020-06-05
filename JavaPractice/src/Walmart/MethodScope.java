package Walmart;

public class MethodScope {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Temp obj = Temp.create(20); 
		obj.myMethod(); 


	}

}

class Temp 
{ 
	private Temp(int data) 
	{ 
		System.out.printf(" Constructor called "); 
	} 
	protected static Temp create(int data) 
	{ 
		Temp obj = new Temp(data); 
		return obj; 
	} 
	public void myMethod() 
	{ 
		System.out.printf(" Method called "); 
	} 
} 

