import java.util.Comparator;

public class AddressSort implements Comparator<EmployeeComparator>
{
	public int compare(EmployeeComparator emp1,EmployeeComparator emp2)
	{
		return emp1.getEmpadd().compareTo(emp2.getEmpadd());
		
	}

}
