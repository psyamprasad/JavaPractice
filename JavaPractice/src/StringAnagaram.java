import java.util.Arrays;

public class StringAnagaram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		/*
		String str1="creativedz";
		String str2="kreactived";
		int len1,len2,len,found=0,not_found=0;
		len1=str1.length();
		len2=str2.length();
		
		if(len1 == len2)
		{
			System.out.println("equal");
			len=len1;
			for(int i=0;i<len;i++)
			{
				found=0;
				for(int j=0;j<len;j++)
				{
					if(str1.charAt(i) == str2.charAt(j))
					{
						found =1;
						break;
					}
					
					
				}
				if(found == 0)
				{
					not_found=1;
					break;
				}
				
			}
			
			if(not_found == 1)
			{
				System.out.println("not a anagaram");
			}
			else
			{
				System.out.println("anagaram");
			}
		}
		else
		{
			System.out.println("not equal");
		}
		
		*/
		
		/*String str1="creativem";
		String str2="reactivel";
		int len1,len2;
		len1=str1.length();
		len2=str2.length();
		boolean flag=true; 
		
		if(len1 == len2)
		{
			System.out.println("equals");
			
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 for(int i=0;i<len1;i++)
			 {
				  flag=false;
				 if(ch1[i] != ch2[i])
				 {
					//System.out.println("anagaram");
					 System.out.println(ch1[i]);
					 System.out.println(ch2[i]);
					 flag=false;
				  }
		 
			 else
			 {
				// System.out.println("not a anagaram");
				 flag=true;
				 
			 }
			 
			 }
			
			// if(flag == true)
			 if(!flag)
			 {
				 System.out.println("not a anagaram");
				 
			 }
			 else
			 {
				 System.out.println("anagram");
			 }
		}
		else
		{
			System.out.println("not a equals");
		}
		
		*/
		
		
		//String str1="recitals";
		//String str2="articles";
		/*
		String str1 = "recitals";
	      String str2 = "articles";
		
		int len1,len2;
		len1=str1.length();
		len2=str2.length();
		
		
		if(len1 == len2)
		{
			System.out.println("equals");
			
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 
			 System.out.println(Arrays.toString(ch1));
			 System.out.println(Arrays.toString(ch2));
			 System.out.println(Arrays.equals(ch1, ch2));
			 
			 if(ch1.equals(ch2)) 
			 
			// if(ch1.equals(ch2))
			 {
				 System.out.println("Given strings are anagrams");
				 
			 }
			 else
			 {
				 System.out.println("Given strings are not anagrams");
			 }
			
		}
		else
		{
			System.out.println("not equals");
			
		}
		*/
		
		/*
		String str1 = "recitals";
	      String str2 = "articles";

	      if (str1.length()==str2.length()) {
	         char[] arr1 = str1.toCharArray();
	         Arrays.sort(arr1);
	         System.out.println(Arrays.toString(arr1));
	         char[] arr2 = str2.toCharArray();
	         Arrays.sort(arr2);
	         System.out.println(Arrays.toString(arr2));
	         System.out.println(Arrays.equals(arr1, arr2));
	         if(arr1.equals(arr2)) {
	            System.out.println("Given strings are anagrams");
	         } else {
	            System.out.println("Given strings are not anagrams");
	         }
	      }
           */
		
		
		  String str1="recitals";
		  String str2="articles";
		  int len1=str1.length();
		  int len2=str2.length();
		  boolean status=true;;
		  if(len1!=len2)
		  {
			  status=false;
			  
		  }
		  else
		  {
			 char ch1[]=str1.toCharArray();
			 char ch2[]=str2.toCharArray();
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 status=Arrays.equals(ch1, ch2);
			  
		  }
		  if(status)
		  {
			  System.out.println("anagaram");
			  
		  }
		  else
		  {
			  System.out.println("not a anagaram");
		  }

	}

}
