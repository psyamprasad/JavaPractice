package snippet;

class Detative
{
}

class ShareLack extends Detative
{
	
}
class Watson extends Detative
{
	
}
public class TestDetative {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Detative detative=new ShareLack();
		if(detative instanceof ShareLack)
			System.out.println("ShareLack");
		else if(detative instanceof Detative)
			System.out.println("Detative");
		else if(detative instanceof Watson)
			System.out.println("Watson");
		else
			System.out.println("unexcepted");
		

	}

}
