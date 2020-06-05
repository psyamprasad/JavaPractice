package snippet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndHAshMApDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<>();
		map.put(234, "sharelock");
		Collections.unmodifiableMap(map); 
		//Map<Integer,String> map1=Collections.unmodifiableMap(map);
		map.put(432, "watson");
		System.out.println(map);
		//System.out.println(map1);
		//map1.put(123, "home");
		//System.out.println(map1);
		
		
		/*
		Map<String,Integer> map=new HashMap<>();
		map.put(new String("[]"), 123);
		map.put(new String("[]"), 124);
		map.remove(new String("[]"));
		System.out.println(map);
		*/
		
		/*
		List<String> list1=new ArrayList<>();
		list1.add("A");
		List<String> list2=list1;
		List<String> list3=new ArrayList<>(list1);
		list1.clear();
		list2.add("B");
		list3.add("C");
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		*/
		
		/*
		String str="syam";
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		*/
		
		/*
		String str="syam Prasad";
		char ch[]=str.toCharArray();
		int i=0,j=str.length()-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(new String(ch));
		*/
		
		/*
		String str="Syam";
		char[] ch=str.toCharArray();
		int i=0,j=str.length()-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		
		}
		System.out.println(new String(ch));
		*/
		
		
		  

	}

}
