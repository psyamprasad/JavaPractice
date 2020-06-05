import java.util.ArrayList;

public class DuplicatesIntegerArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		int array[]= {1,2,1,3,4,1};
		int array1[]=new int[array.length];
		int count=0,counter=0;
		boolean isDist=false;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(array[i] == array[j])
				{
					isDist=true;
					break;
					
				}
				
			}
			if(!isDist)
			{
				array1[counter++]=array[i];
			}
			
		}
		
		for(int i=0;i<counter;i++)
		{
			count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array1[i] == array[j])
				{
					count++;
				}
			}

		if(count !=1)
		{
			System.out.println(array1[i]+"="+count+"\t");
		}
		}
		*/
		
		int a[]= {9,1,3,5,3,7,8,8,1};
		ArrayList al=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
			}
			
		}
		
		System.out.println(al);
		
		

	}

}
