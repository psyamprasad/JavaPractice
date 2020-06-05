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

public class CollectiuonsTest {

	public static void main(String[] args) 
	{
		/*
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("JDK 1.1.4", "Sparkler"); 
		map.put("J2SE 1.2", "Playground"); 
		map.put("J2SE 1.3", "Kestrel"); 
		map.put("J2SE 1.4", "Merlin"); 
		map.put("J2SE 5.0", "Tiger");
		map.put("Java SE 6", "Mustang"); 
		map.put("Java SE 7", "Dolphin");

		
		
		
		Map<String,String> map1=new TreeMap<>(map);
		Set<Entry<String,String>> set=map1.entrySet();
		
		for(Entry<String,String> ent2:set)
		{
			System.out.println(ent2.getKey()+""+ent2.getValue());
			
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
		
		LinkedHashMap<String,String> linkMap=new LinkedHashMap<String,String>(list.size());
		for(Entry<String,String> ent:list)
		{
			linkMap.put(ent.getKey(), ent.getValue());
		}
		
		Set<Entry<String,String>> set1=linkMap.entrySet();
		for(Entry<String,String> ent1:set1)
		{
			System.out.println(ent1.getKey()+""+ent1.getValue());
			
		}
		*/
		
		List<Integer> list=new ArrayList<>();
		/*list.add("string1");
		list.add("string");
		list.add("string3");
		list.add("string2");
		*/
		list.add(12);
		list.add(10);
		list.add(11);
		list.add(9);
		list.add(8);
		
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
