import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortArrayWithNull {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*
		int arr[]= {2,4,1,5};
		int temp=arr[0];
		int vars=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			}
		
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}*/
		
		/*
		int arr[]= {2,5,1,8,0};
		int temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		*/
		
		/*
		int arr[]= {2,9,7,3,8};
		List<Integer> list=new ArrayList(arr.length);
		for(int i:arr)
		{
			list.add(Integer.valueOf(i));
			//list.add(i);
		}
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=list.size()-1;j>i;j--)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}	
				
			}
			
		}
		System.out.println(list);
		
		*/
		
		/*
		int arr[]= {7,8,8,9,7,5,6,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		for(int i:arr)
		{
			System.out.print(i);
			
		}
		*/
		
		int arr[]= {4,8,7,5,1,9,2};
		List<Integer> list=new ArrayList();
		for(int i:arr)
		{
			list.add(Integer.valueOf(i));
			
		}	
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=list.size()-1;j>i;j--)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}
				
			}
		}
		
		System.out.println(list);
	}

}
