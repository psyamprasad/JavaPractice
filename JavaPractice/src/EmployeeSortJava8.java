import java.util.ArrayList;
import java.util.List;

public class EmployeeSortJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(121,"syam"));
		list.add(new Employee(122,"pandi"));
		list.add(new Employee(123,"vassu"));
		list.add(new Employee(124,"prasad"));
		//list.stream().filter(emp->emp.getEmpId()>122).forEach(System.out::println);
		//list.forEach(System.out::println);
		list.forEach(emp->System.out.println(emp));
		
		
		
        
		System.out.println();
		//System.out.println("java 7");
		
        for(Employee emp:list)
        {
        	if(emp.getEmpId()>122)
        	{
        		 System.out.print("ID, Name : ");
        		System.out.println(emp.getEmpId()+","+emp.getEmpname());
        		
        	}
        	
        }


	}

}
