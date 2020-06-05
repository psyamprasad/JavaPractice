package Walmart;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   // some other stuff
		   try {
		       // Some monitored code
		       throw new Derived();
		    }

		    catch(Base b)     { 
		       System.out.println("Caught base class exception"); 
		    }
		    
		 //  catch(Derived d)  { 
		      // System.out.println("Caught derived class exception"); 
		   /// }

	}

}

class Base extends Exception {}
class Derived extends Base  {}
