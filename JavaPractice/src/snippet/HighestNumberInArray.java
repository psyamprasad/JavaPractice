package snippet;

public class HighestNumberInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		int num[]= {4,7,8,4,7,9,7,2,-10,4,7};
		int high=num[0];
		int repeate=num[0];
		int result=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>high)
			{
				high=num[i];
				
			}
			int count=1;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count++;;
					
				}
				
			}
			if(repeate<count)
			{
				repeate=count;
				result=num[i];
				
			}
			
		}
         System.out.println(high);
         System.out.println(result);
         */
		
		int arr[]= {8,4,7,12,2,10,3,3,9};
		int total=arr.length;
	    int second=arr[0];
	    int first=arr[0];
	    int third=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			/*
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			second=arr[total-2];
			*/
			
			if(arr[i]>first)
			{
				third=second;
				second=first;
				first=arr[i];
				
			}
			else if(arr[i]>second)
			{
				third=second;
				second=arr[i];
				
			}
			else if(arr[i]>third)
			{
				third=arr[i];
				
			}
		}
		System.out.println(first);
		System.out.println(second);	
		System.out.println(third);
		
	}

}
