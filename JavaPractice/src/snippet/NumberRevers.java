package snippet;

public class NumberRevers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num=4321;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
			
		}
		System.out.println(reverse);

	}

}
