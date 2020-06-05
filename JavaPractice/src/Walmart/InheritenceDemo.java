package Walmart;

public class InheritenceDemo extends Geeks{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Geeks obj = new InheritenceDemo(); 
		obj.getInfo(); 


	}
	
	public void myMethod() 
	{ 
		System.out.println("GeeksforGeeks"); 
	} 
	public void getInfo() 
	{ 
		System.out.println("Geeks"); 
	} 


}

interface GFG 
{ 
	void myMethod(); 
	void getInfo(); 
} 

abstract class Geeks implements GFG 
{ 
	void getData() 
	{ 
		System.out.println("GFG"); 
	} 
} 

