package snippet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StringWordAndCharacterDuplicates {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*
		String str="sjuhdnndw";
		char ch[]=str.toCharArray();
		//HashMap<Character,Integer> map=new HashMap();
		Map<Character,Integer> map=new TreeMap();
		for(Character ch1:ch) {
		if(map.containsKey(ch1))
		{
			map.put(ch1, map.get(ch1)+1);
		}
		else
		{
			map.put(ch1, 1);
		}
		}
		Set<Entry<Character,Integer>> set=map.entrySet();
		for(Entry<Character,Integer> ent:set)
		{
			if(ent.getKey()>1)
			{
				System.out.println(ent.getKey()+"\t"+ent.getValue());
				
			}
			
		}
		*/
		
		/*
		String strarr="syam raju prasad syam raju hhtytftftf";
		String str[]=strarr.split("\\s");
		Map<String,Integer> map=new HashMap();
		for(String words:str)
		{
			if(words.length()<=2)
			{
				continue;
				
			}
			Integer existnum=map.get(words);
			map.put(words, (existnum==null?1:(existnum+1)));
			
		}
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Entry<String,Integer> ent:set)
		{
			if(ent.getValue()<=2)
			{
				System.out.println(ent.getKey()+"\t"+ent.getValue());
				
			}
			
		}
         */
		
		String strarr="syam raju prasad syam raju hhtytftftf";
		String str[]=strarr.split("\\s");
		Map<String,Integer> map=new HashMap();
		for(String words:str)
		{
			if(map.containsKey(words))
			{
				map.put(words, map.get(words)+1);
			}
			else
			{
				map.put(words, 1);
			}
			
		}
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Entry<String,Integer> ent:set)
		{
			if(ent.getValue()<=2)
			{
				System.out.println(ent.getKey()+"\t"+ent.getValue());
				
			}
			
		}
        
	}

}
