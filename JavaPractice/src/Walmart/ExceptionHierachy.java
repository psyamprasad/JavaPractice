package Walmart;
import java.io.IOException; 
import java.util.EmptyStackException; 

public class ExceptionHierachy {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try
		{ 
			System.out.printf("%d", 1); 
			throw(new Exception()); 
		} 
		catch(IOException e) 
		{ 
			System.out.printf("%d", 2); 
		} 
		catch(EmptyStackException e) 
		{ 
			System.out.printf("%d", 3); 
		} 
		catch(Exception e) 
		{ 
			System.out.printf("%d", 4); 
		} 
		finally
		{ 
			System.out.printf("%d", 5); 
		} 


	}

}
