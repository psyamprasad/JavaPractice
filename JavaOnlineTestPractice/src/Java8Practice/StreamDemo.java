package Java8Practice;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("a1","b1","c1","c2");
		list.stream().filter(s->s.startsWith("c")).map(String::toUpperCase)
        .sorted().forEach(System.out::println);
	}

}
