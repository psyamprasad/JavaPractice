package snippet;

public class StaticDemo
{
    public static class Parent
    {
    	void print()
    	{
    		System.out.println("Parent is print");
    	}
    }
    public static class Child extends Parent
    {
    	@Override
    	void print()
    	{
    		System.out.println("Child is print");
    	}
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Parent p=new Parent();
		Parent c=new Child();
		p.print();
		c.print();

	}

}
