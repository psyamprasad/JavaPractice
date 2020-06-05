package Walmart;

public class MethodOverloading 
{
	private int data = 5; 

	public int getData() 
	{ 
		return this.data; 
	} 
	public int getData(int value) 
	{ 
		return (data+1); 
	} 
	public int getData(int... value) 
	{ 
		return (data+2); 
	} 


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		MethodOverloading temp = new MethodOverloading(); 
		System.out.println(temp.getData(7, 8, 12)); 



	}

}
