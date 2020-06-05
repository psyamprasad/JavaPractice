
public class CheckStringPrime {

	static int MAX_CHAR = 256; 
	
    public static boolean isPalindrome(String str,  
                                       int l, int h)  
    {     
        while(h > l) 
            if (str.charAt(l++) != str.charAt(h--)) 
                return false;          
        return true; 
    }  
    public static boolean check(String str) 
    {    
        int n = str.length();    
        int[] freq = new int[MAX_CHAR];          
        for (int i = 0; i < n; i++)  
        {  
            freq[str.charAt(i)]++;  
      
            if (freq[str.charAt(i)] > 2)  
                return true;  
        }      
        int k = 0;  
        for (int i = 0; i < n; i++)  
            if (freq[str.charAt(i)] > 1)  
                str.replace(str.charAt(k++),  
                            str.charAt(i));  
        str.replace(str.charAt(k), '\0');  
        if (isPalindrome(str, 0, k - 1))  
        { 
            if ((k & 1) == 1)  
            { 
                if (k / 2 >= 1) 
                    return (str.charAt(k / 2) ==  
                        str.charAt(k / 2 - 1)); 
            } 
           
            return false;  
        }  
         
        return true;  
    } 
      
    public static void main(String[] args) 
    { 
        String str = "abefdeyz"; 
          
        if (check(str)) 
            System.out.println("Repeated Subsequence Exists"); 
        else
            System.out.println("Repeated Subsequence" +  
                               " Doesn't Exists");  
    } 

}
