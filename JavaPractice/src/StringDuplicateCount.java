
public class StringDuplicateCount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringDuplicateCount strcount=new StringDuplicateCount();
		String s="aaaabbbbc";
		strcount.deleteCount(s);

	}
	
	public static void deleteCount(String str)
	{
		int count[]=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			
			count[str.charAt(i)]++;
		}
		char chars[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			chars[i]=str.charAt(i);
			int flag=0;
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==chars[j])
				{
					flag++;
				}
				
			}
			if(flag==1)
			{
				System.out.println(str.charAt(i)+"\t"+count[str.charAt(i)]);
			}
		}
		
	}

}
