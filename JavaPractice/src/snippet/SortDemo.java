package snippet;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo implements Comparator<SortDemo> {

	 int dist;
	 SortDemo(int d)
	 {
		 dist=d;
		 
	 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SortDemo[] sd= {new SortDemo(40),new SortDemo(200),new SortDemo(60)};
		Arrays.sort(sd,sd[0]);
		int index=Arrays.binarySearch(sd, new SortDemo(40),sd[0]);
		System.out.println(index+"");
		index=Arrays.binarySearch(sd, new SortDemo(80),sd[0]);
		System.out.println(index);
		

	}
	
	public int compare(SortDemo s1,SortDemo s2)
	{
		return s2.dist-s1.dist;
		
	}

}
