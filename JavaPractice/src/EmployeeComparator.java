
public class EmployeeComparator implements Comparable<EmployeeComparator>
{
	private int empid;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpadd() {
		return empadd;
	}

	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}

	private String empname;
	private String empadd;
	
	public EmployeeComparator(int empid,String empname,String empadd)
	{
		this.empid=empid;
		this.empname=empname;
		this.empadd=empadd;
	}
	
	public String toString()
	{
		return empid+"\t"+empname+"\t"+empadd;
	}
	
	@Override
	public int compareTo(EmployeeComparator ec)
	{
		return this.empid-ec.empid;
	}

}
