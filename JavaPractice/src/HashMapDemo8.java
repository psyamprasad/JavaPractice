import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapDemo8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("syam", "syam1");
		map.put("prasad", "syam1");
		map.put("pandi", "syam3");
		//System.out.println(map);
		Set<Map.Entry<String, String>> set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> map1=(Entry<String, String>) it.next();
			//System.out.println(map1.getKey()+"\t"+map1.getValue());
		}
		
		//java 8 
		map.forEach((k,v)->
		{
			//System.out.println(k+"\t"+v);
		});
		
		//java 8 use Stream
		
		Map<String,String> map2=map.entrySet()
		.stream()
		.filter(map3 -> "syam1".equals(map3.getValue()))
		.collect(Collectors.toMap(map3 ->map3.getKey(), map3 -> map3.getValue()));
        
		System.out.println(map2);
	}

}
