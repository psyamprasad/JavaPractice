import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSorts {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//IntegerSorts in=new IntegerSorts();
		List<Integer> list=new ArrayList();
		list.add(122);
		list.add(121);
		list.add(124);
		list.add(123);
		IntegerSorts.sorts(list);
		for(Integer list1:list)
		{
			System.out.println(list1+" ");
			
		}

	}
	
	public static List<Integer> sorts(List<Integer> list)
	{
		//list=new ArrayList();
		Collections.sort(list);
		return list;
		
	}

}
