import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfEachCharacterInString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="abcabcbbaaaccccddabde";
		char ch[]=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(Character ch1:ch)
		{
			if(map.containsKey(ch1))
			{
				map.put(ch1, map.get(ch1)+1);
				
			}
			else
			{
				map.put(ch1, 1);
			}
			
		}
		//Set<Character> set=map.keySet();
		Set<Map.Entry<Character,Integer>> set=map.entrySet();
		for(Map.Entry<Character, Integer> mapd:set)
		{
			if(mapd.getKey()>1)
			{
				System.out.println(mapd.getKey()+""+mapd.getValue());
			}
		}
		/*
		for(Character ch2:set)
		{
			if(map.get(ch2)>1)
			{
				System.out.println(ch2+""+map.get(ch2));
				
			}
			
		}*/
		

	}

}

/*
 output:
a6
b5
c6
d3
e1
 */
