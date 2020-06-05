package snippet;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			MethodThrow();
			System.out.println("I");
		}
		catch(RuntimeException r)
		{
			System.out.println("J");
			
		}
		catch(Exception r)
		{
			System.out.println("K");
			
		}
		finally
		{
			System.out.println("L");
		}
		System.out.println("M");

	}
	public static void MethodThrow()
	{
		throw new RuntimeException();
	}

}
