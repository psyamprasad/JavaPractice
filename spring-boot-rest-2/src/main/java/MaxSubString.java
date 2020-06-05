import java.util.ArrayList;

public class MaxSubString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*String str="abc";
		String str1=null;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{ 	
				 str1=str.substring(i, j);
				// System.out.println(str.substring(i, j));
				// System.out.println(str1);
			
			}
			
		}
		 System.out.println(str1);
		 */
		
		String str="abc";
		String str1=null;
		ArrayList al=new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
			  str1=str.substring(i, j);
			 // System.out.println(str.substring(i,j));
			  //System.out.println(str1);
			}
			
		}
		
		System.out.println(str1);

	}

}
