import java.util.Scanner;

public class PostiveAndNegitive {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		PostiveAndNegitive pn=new PostiveAndNegitive();
		int size;
		System.out.print("enter the array range");
		size=sc.nextInt();
		int A[]=new int[size] ;
		
		System.out.print("enter the array"+size);
		for(int i=0;i<size;i++)
		{
			A[i]=sc.nextInt();
			
		}
		
		int coun=pn.solution(A);
		System.out.println(coun);

	}
	
	public int solution(int A[])
	{
		int count=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]<0)
			{
			  System.out.print(A[i]);
			  count++;
			}
			System.out.println();
		}
		return count;
	}
		
		
		/*
		int size;
		System.out.println("enter the range");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
	}*/

}
