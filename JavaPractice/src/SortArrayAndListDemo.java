import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayAndListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	//	int arr[]= {2,8,7,9,6,1,5};
		
		/*
		List<Integer> list=new ArrayList(arr.length);
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
		*/
		
		/*
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		for(int k:arr)
		{
			System.out.print(k);
			System.out.print("\t");
			
		}
		*/
		
		/*
		List<Integer> list=new ArrayList();
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(null);
		list.add(2);
		list.add(null);
		
		//System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		/*
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
		*/
		
		/*
		//String str[]= {null,"syam",null,"prasad",null,"pandi"};
		String str[]= {"syam","prasad","pandi"};
		//Arrays.sort(str, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
		System.out.println(Arrays.toString(str));
			
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(str));
		*/
		
		
		
		 String[] strings = { "aman", "suvam", null, 
                 "sahil", null }; 

// print the array 
System.out.println("Before sorting: "
               + Arrays.toString(strings)); 

// apply nullsLast  method 
// and sort the array 
Arrays.sort(strings, 
        Comparator.nullsLast( 
            Comparator.naturalOrder())); 

// print the array 
System.out.println("After sorting: "
               + Arrays.toString(strings)); 
	
	}

}
