import java.util.ArrayList;
import java.util.List;

public class EmployeeJava8Sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(123,"sunny"));
		list.add(new Employee(124,"vassu"));
		list.add(new Employee(122,"prasad"));
		list.add(new Employee(121,"syam"));
		//System.out.println(list);
		list.stream().filter(emp->emp.getEmpId()<123).forEach(System.out::println);
		
		for(Employee emp1:list)
		{
			if(emp1.getEmpId()<123)
			{
				System.out.print("EMPID,EMPNAME :");
				System.out.println(emp1.getEmpname()+"\t"+emp1.getEmpId());
				
			}
			
		}

	}

}
