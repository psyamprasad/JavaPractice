
public class StringPalindaram {

	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
		/* String str="abba";
		 int j=str.length()-1;
		 for(int i=0;i<j;i++,j--)
		 {
			 if(str.charAt(i) != str.charAt(j))
			 {
				 System.out.println("no");
				 
			 }
			 else
			 {
				 System.out.println("yes");
			 }
			 
		 }
		 */
		
		String str="geeks";
		String str1="";
		System.out.println(str+" given String");
		
		int len=str.length()-1;
		System.out.println(len);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
			
		}
		
		System.out.println(str1);
		
		if(str.equals(str1))
		{
			System.out.println(str1+" palendearm");
			
		}
		else
		{
			System.out.println(str+" not palendearm");
		}

	}

}
