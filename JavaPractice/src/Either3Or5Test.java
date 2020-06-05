
public class Either3Or5Test
{   
	public static int a=3;
	public static int b=5;
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		for(int i=1;i<=20;i++)
		{
			String s="";
			if(i==a)
			{
				a=a+3;
				s=s+"usb";
				
			}
			if(i==b)
			{
				b=b+5;
				s=s+"device";
				
			}
			if(s=="")
			{
				System.out.println(i);
				
			}
			else
			{
				System.out.println(s);
			}
			
		}
		*/
		
		for(int i=1;i<20;i++)
		{
			if(i%3==0)
			{
				System.out.println("usb");
				
			}
			if(i%5==0)
			{
				System.out.println("device");
				
			}
			if(i%15==0)
			{
				System.out.println("usbdevice");
				
			}
			System.out.println(i);
			
		}

	}

}
