import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<>();
		
		
		map.put("JDK 1.1.4", "Sparkler"); 
		map.put("J2SE 1.2", "Playground"); 
		map.put("J2SE 1.3", "Kestrel");
		map.put("J2SE 1.4", "Merlin");
		map.put("J2SE 5.0", "Tiger"); 
		map.put("Java SE 6", "Mustang"); 
		map.put("Java SE 7", "Dolphin");

		
		/*
		Set<Map.Entry<String,String>> set=map.entrySet();	
		for(Map.Entry<String, String> ent:set)
		{
			System.out.println(ent.getKey()+"\t"+ent.getValue());	
		}
		TreeMap<String,String> tree=new TreeMap<>(map);
		Set<Map.Entry<String, String>> set1=tree.entrySet();
		System.out.println();
		for(Map.Entry<String, String> ent1:set1)
		{
			System.out.println(ent1.getKey()+"\t"+ent1.getValue());
		}
		
		Comparator<Map.Entry<String, String>> com=new Comparator<Map.Entry<String, String>>()
		{
			public int compare(Entry<String,String> e1,Entry<String,String> e2)
			{
				String s1=e1.getValue();
				String s2=e2.getValue();
				return s1.compareTo(s2);
			}
			
		};
		
		List<Map.Entry<String,String>> list=new ArrayList<Map.Entry<String,String>>(set);
		Collections.sort(list, com);
		LinkedHashMap<String,String> listmap=new LinkedHashMap<>(list.size());
		for(Map.Entry<String,String> map1:list)
		{
			listmap.put(map1.getKey(), map1.getValue());
		}
		
		Set<Map.Entry<String, String>> set2=listmap.entrySet();
		System.out.println();
		for(Map.Entry<String, String> map2:set2)
		{
			System.out.println(map2.getKey()+"\t"+map2.getValue());
			
		}
		*/
		
		
		/*
		Set<Entry<String,String>> set=map.entrySet();
		for(Entry<String,String> ent:set)
		{
			System.out.println(ent.getKey()+"\t"+ent.getValue());
			
		}
		
		System.out.println();
		TreeMap<String,String> treemap=new TreeMap<>(map);
		Set<Entry<String,String>> set1=treemap.entrySet();
		for(Entry<String,String> ent1:set1)
		{
			System.out.println(ent1.getKey()+"\t"+ent1.getValue());
		}
		
		Comparator<Map.Entry<String,String>> comp=new Comparator<Map.Entry<String,String>>()
	    {
			public int compare(Map.Entry<String,String> ent1,Map.Entry<String,String> ent2)
			{
				String s1=ent1.getValue();
				String s2=ent2.getValue();
				return s1.compareTo(s2);
			}
			  
	    };
	    
	    List<Entry<String,String>> list=new ArrayList<Entry<String,String>>(set);
	    Collections.sort(list, comp);
	    LinkedHashMap<String,String> linke=new LinkedHashMap<String,String>(list.size());
	    for(Entry<String,String> ent2:list)
	    {
	    	linke.put(ent2.getKey(), ent2.getValue());
	    	
	    }
	    System.out.println();
	    Set<Entry<String,String>> set3=linke.entrySet();
	    for(Entry<String,String> ent3:set3)
	    {
	    	System.out.println(ent3.getKey()+"\t"+ent3.getValue());
	    	
	    }
	    */
		
		Set<Entry<String,String>> set=map.entrySet();
		for(Entry<String,String> entry:set)
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		System.out.println();
		TreeMap<String,String> treemap=new TreeMap<String,String>(map);
		Set<Entry<String,String>> s=treemap.entrySet();
		for(Entry<String,String> e:s)
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
			
		}
		
		Comparator<Entry<String,String>> comp=new Comparator<Entry<String,String>>()
		{
			public int compare(Entry<String,String> e1,Entry<String,String> e2)
			{
				String s1=e1.getValue();
				String s2=e2.getValue();
				return s1.compareTo(s2);
			}
	    };
		
	    System.out.println();
	    List<Entry<String,String>> list=new ArrayList<Entry<String,String>>(set);
	    Collections.sort(list, comp);
	    LinkedHashMap<String,String> linked=new LinkedHashMap<String,String>(list.size());
	    for(Entry<String,String> ent:list)
	    {
	    	linked.put(ent.getKey(), ent.getValue());
	    	
	    }
	    Set<Entry<String,String>> set1=linked.entrySet();
	    for(Entry<String,String> ent1:set1)
	    {
	    	System.out.println(ent1.getKey()+"\t"+ent1.getValue());
	    }
	    
	   }
		
	}


