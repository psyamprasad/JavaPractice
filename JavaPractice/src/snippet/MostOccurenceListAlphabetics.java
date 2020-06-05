package snippet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostOccurenceListAlphabetics {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String arr[]= {"facebook","google","facebook"};
		
		Map<String,Integer> map=new HashMap<>();
		for(String str:arr)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
				
			}
			else
			{
				map.put(str, 1);
			}
			
		}
		
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Entry<String,Integer> ent:set)
		{
			if(map.get(ent)>1)
			{
				System.out.println(map.get(ent));
				
			}
			
		}

	}

}
