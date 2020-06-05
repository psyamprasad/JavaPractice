
public class Employee {
	private int empid;
	private String empname;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpId(int empid)
	{
		this.empid=empid;
		
	}
	public int getEmpId()
	{
		return empid;
		
	}
	
	public Employee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		
	}
	
	public String toString()
	{
		System.out.print("EMPNAME,EMPID :");
		return this.empname+"\t"+this.empid;
	}

}
