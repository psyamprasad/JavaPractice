import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java8Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("syam","syam1","vassu");
		List<String> result=getFilterOutput(list,"syam");
		for(String temp:result)
		{
			System.out.println(temp);
			
		}
	}
	
	private static List<String> getFilterOutput(List<String> lines,String filter)
	{
		
		List<String> list=new ArrayList<>();
		for(String line:lines)
		{
			if(!"syam".equals(line))
			{
				list.add(line);
			}	
		}
		return list;
	}

}
