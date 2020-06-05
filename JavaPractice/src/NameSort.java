import java.util.Comparator;

public class NameSort implements Comparator<EmployeeComparator>
{
	public int compare(EmployeeComparator emp1,EmployeeComparator emp2)
	{
		return emp1.getEmpname().compareTo(emp2.getEmpname());
		
	}

}
