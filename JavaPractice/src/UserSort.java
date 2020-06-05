import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserSort {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		User u1=new User(12,"syam");
		User u4=new User(14,"syam3");
		User u3=new User(11,"syam2");
		User u2=new User(13,"syam1");
		
		List<User> list=Arrays.asList(null,u1,null,u2,u3,u4);
		
		Collections.sort(list,Comparator.nullsLast(Comparator.comparing(User::getName)));
		//list.forEach(System.out::println);
		list.forEach(user->System.out.println(user));
System.out.println();
		
//List<User> list1=Arrays.asList(null,u1,null,u2,u3,u4);
		
		Collections.sort(list,Comparator.nullsFirst(Comparator.comparing(User::getName)));
		//list.forEach(System.out::println);
		list.forEach(user1->System.out.println(user1));

	}

}
