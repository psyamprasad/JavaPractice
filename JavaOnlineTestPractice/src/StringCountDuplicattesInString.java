import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCountDuplicattesInString {

	public static void main(String[] args) 
	{
		/*
		String s="abcabcbbaaaccccddabde";
		char ch[]=s.toCharArray();
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
		
		Set<Character> set=map.keySet();
		for(Character ch2:set)
		{
			if(map.get(ch2)>1)
			{
				System.out.println(ch2+""+map.get(ch2));
				
			}
			
		}**/
		
		/*
		String str="abcabcbbaaaccccddabde";
		Map<Character,Integer> map=new HashMap<>();
		char ch[]=str.toCharArray();
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
		
		Set<Character> set=map.keySet();
		for(Character ch2:set)
		{
			if(map.get(ch2)>1)
			{
				System.out.println(ch2+""+map.get(ch2));
				
			}
			
		}
		*/
		String string1="abcabcbbaaaccccddabde";
		int count;  
		 //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  

	}

}
