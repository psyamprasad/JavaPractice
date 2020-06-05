public class StringSwiichCase {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String state = ""; 
		switch (state) 
		{ 
		    case "NEW":
			System.out.println("Order is in NEW state"); 
			break; 
			case "CANCELED": 
				System.out.println("Order is Cancelled"); 
			break;
			case "REPLACE":
				System.out.println("Order is replaced successfully"); 
			break; 
			case "FILLED":
				System.out.println("Order is filled"); 
			break; 
			default:
				System.out.println("Invalid"); 
		}

	}

}
