package snippet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToLinkedHashMap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		Map<String,String> map=new HashMap<>();
		map.put("syam", "java6");
		map.put("prasad", "java5");
		map.put("sunny", "java7");
		map.put("pandi", "java8");
		
		Set<Entry<String,String>> set=map.entrySet();
		for(Entry<String,String> ent:set)
		{
			System.out.println(ent.getKey()+"\t"+ent.getValue());
			
		}
		
		System.out.println();
		Comparator<Entry<String,String>> comp=new Comparator<Entry<String,String>>()
		{
			public int compare(Entry<String,String> e1,Entry<String,String> e2)
			{
			    String s1=e1.getValue();
			    String s2=e2.getValue();
			    return s1.compareTo(s2);
			}
			
		};
		
		List<Entry<String,String>> list=new ArrayList<>(set);
		Collections.sort(list, comp);
		LinkedHashMap<String,String> linkmap=new LinkedHashMap<>(list.size());
		for(Entry<String,String> ent1:list)
		{
			linkmap.put(ent1.getKey(), ent1.getValue());
			
		}
		
		Set<Entry<String,String>> set1=linkmap.entrySet();
		for(Entry<String,String> ent2:set1)
		{
			System.out.println(ent2.getKey()+"\t"+ent2.getValue());
			
		}
		*/
		
		Map<String,String> map=new HashMap<>();
		map.put("syam", "java8");
		map.put("vassu", "java6");
		map.put("syam's", "java1");	
		map.put("prasad", "java5");
		map.put("sunny", "java2");
		map.put("pandi", "java7");		
		
		Comparator<Entry<String,String>> comp=new Comparator<Entry<String,String>>()
	    {
			public int compare(Entry<String,String> e1,Entry<String,String> e2)
			{
				String s1=e1.getValue();
				String s2=e2.getValue();
				return s1.compareTo(s2);
				
			}
			
		};
		Set<Entry<String,String>> set=map.entrySet();
		ArrayList<Entry<String,String>> list=new ArrayList<>(set);
		Collections.sort(list, comp);
		LinkedHashMap<String,String> linkmap=new LinkedHashMap<String,String>(list.size());
		for(Entry<String,String> entry:list)
		{
			linkmap.put(entry.getKey(), entry.getValue());
			
		}
		Set<Entry<String,String>> set1=linkmap.entrySet();
		for(Entry<String,String> enttry:set1)
		{
			System.out.println(enttry.getKey()+"\t"+enttry.getValue());
			
		}

	}

}
