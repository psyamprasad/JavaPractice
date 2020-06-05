import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeComparator> list=new ArrayList<>();
		list.add(new EmployeeComparator(13,"syam","gnt"));
		list.add(new EmployeeComparator(14,"prasad","hyd"));
		list.add(new EmployeeComparator(11,"vassu","ong"));
		list.add(new EmployeeComparator(12,"pandi","vza"));
		
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);

	}

}
