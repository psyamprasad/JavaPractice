
public class User implements Comparable<User>
{
  public int age;
  public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String name;
  
  public User(int age,String name)
  {
	  this.age=age;
	  this.name=name;
	  
  }
  
  public int compareTo(User u1)
  {
	  return name.compareTo(u1.name);
  }
  
  public String toString()
  {
	  return name+"\t"+age;
  }
}
