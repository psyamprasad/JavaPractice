package snippet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Snippet 
{
	public static void main(String args[])
	{
		/*
		String str="I love India";
		System.out.println(str);
		System.out.println(str.replaceAll(" " , ""));
		//System.out.println(str);
		 */
		
		
		Map<Integer,Character> map;
		map=new HashMap<>();
		//map=new LinkedHashMap<>();
		//map=new TreeMap<>();
		
		
		map.put(1, 'a');
		map.put(3, 'b');
		map.put(2, 'c');
		
		System.out.println(map);
		
		
		

		
		
	}
}

