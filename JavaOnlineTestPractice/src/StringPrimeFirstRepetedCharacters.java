import java.util.HashSet;

public class StringPrimeFirstRepetedCharacters {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String str = "xyabxyae"; 
	        char[] arr = str.toCharArray(); 
	        System.out.println(firstRepeating(arr)); 
       
	}
	
	static char firstRepeating(char str[]) 
    { 
        // Creates an empty hashset 
        HashSet<Character> h = new HashSet<>(); 
  
        // Traverse the input array from left to right 
        for (int i=0; i<=str.length-1; i++) 
        { 
            char c = str[i]; 
  
            // If element is already in hash set, update x 
            // and then break 
            if (h.contains(c)) 
                return c; 
  
            else // Else add element to hash set 
                h.add(c); 
        } 
  
        return '\0'; 
    } 

}
