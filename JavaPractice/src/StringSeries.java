
public class StringSeries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str="aaaaabbcbccc";
		StringBuffer bf=new StringBuffer();
		for(int i=0;i<str.length();)
		{
			bf.append(str.charAt(i));
			int j=i;
			int count=0;
			while(j<str.length()&&str.charAt(i)==str.charAt(j))
			{
				j++;
				count++;
				
			}
			if(count!=1)
			
				bf.append(count);
				i=i+count;		
			
		}
		
		System.out.println(bf.toString());
		

	}

}
