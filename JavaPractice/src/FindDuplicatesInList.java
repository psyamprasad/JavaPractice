import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		List<String> list=new ArrayList<String>();
		list.add("syam");
		list.add("syam1");
		list.add("syam2");
		list.add("syam1");
		list.add("syam");
		
		Set<String> set1=new HashSet<String>();
		Set<String> set2=new HashSet<String>();
		
		for(String str:list)
		{
			if(!set1.add(str))
			{
				set2.add(str);
			}
		}
		
		System.out.println(list);
		System.out.println(set1);
		System.out.println(set2);
		*/
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<10;i++)
		{
			list.add(String.valueOf(i));
			
		}
		for(int i=0;i<5;i++)
		{
			list.add(String.valueOf(i));
			
		}
		System.out.println(list);
		
		Set<String> set1=new HashSet<String>();
		Set<String> set2=new HashSet<String>();
		
		for(String str:list) 
		{
			if(!set1.add(str))
			{
				set2.add(str);
				
			}
			
		}
		System.out.println(set2);
		System.out.println(set1);
		

	}

}
