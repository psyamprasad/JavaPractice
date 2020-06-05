import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameAndAddressSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<EmployeeComparator> list=new ArrayList<>();
		list.add(new EmployeeComparator(15,"syam","ong"));
		list.add(new EmployeeComparator(13,"vassu","hyd"));
		list.add(new EmployeeComparator(11,"pandi","vza"));
		list.add(new EmployeeComparator(12,"prasad","gnt"));
		System.out.println("before sort");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sort");
		System.out.println(list);
		
		Collections.sort(list, new NameSort());
		System.out.println("After sort the name");
		System.out.println(list);
		
		
		Collections.sort(list, new AddressSort());
		System.out.println("After sort the address");
		System.out.println(list);
		
		
		
		

	}

}
