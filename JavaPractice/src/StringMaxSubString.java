import java.util.ArrayList;


public class StringMaxSubString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*String str="abc";
		String str1[]=str.split("");
		ArrayList al=new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			al.add(str1[i]);
			
		}
		
		System.out.println(al);
		
		*/
		
		
		String s = "abc";
		printPermutn(s, "");
	}
	static void printPermutn(String str, String ans)
	{
		if (str.length() == 0) {
			System.out.print(ans +" ");
			// str.length() is ‘0’
			}
			for (int i = 0; i < str.length(); i++) {
			// str.length is not '0' …. Can you Explain this Please.
			char ch = str.charAt(i);

			String ros = str.substring(0, i) +
			str.substring(i + 1);

			//printPermutn(ros, ch+ans);
			printPermutn(ros, ch+ans);
			
			}
			}

	
}


