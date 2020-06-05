import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDuplicateCount1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="aaaabbbbc";
		char ch[]=s.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(Character ch1:ch)
		if(map.containsKey(ch1))
		{
			map.put(ch1, map.get(ch1)+1);
		}
		else
		{
			map.put(ch1, 1);
		}
		
		Set<Character> set=map.keySet();
		
		for(Character ch2:set)
		{
			if(map.get(ch2)>1)
			{
				System.out.println(ch2+""+map.get(ch2));
				
			}
		}

	}

}
