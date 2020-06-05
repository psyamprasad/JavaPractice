import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	   final Map<String,String> m=new HashMap<>();
		
		
		m.put("syam", "prasad");
		m.put("syam1", "prasad1");
			
		System.out.println(m);
		
		
		
		 final Map<String, String> map =
				Arrays.stream(new String[][]{
					{"1", "one"},
					{"2", "two"}
				}).collect(Collectors.toMap(keyMapper -> keyMapper[0],
										valueMapper -> valueMapper[1]));

		
		 System.out.println(map);
		
		

	}

}
