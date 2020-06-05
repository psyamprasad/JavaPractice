package Walmart;

public class StringCompare {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str1 = new String("Hello World"); 
		String str2 = new String("Hello World"); 
		String str3 = "Hello World"; 
		String str4 = "Hello World"; 
		int a = 0, b = 0, c = 0; 
		if (str3 == str4) 
			a = 1; 
		else
			a = 2; 
		if (str1.equals(str3)) 
			b = 1; 
		else
			b = 2; 
		if (str1 == str4) 
			c = 1; 
		else
			c = 2; 
		System.out.println("a= " + a + " b= " + b + " c= " + c); 


	}

}
