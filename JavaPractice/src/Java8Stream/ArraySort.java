package Java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		int arr[]= {2,5,3,7,9,1,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
			System.out.println(sum/arr.length);
			
			sum=Arrays.stream(arr).sum();
			System.out.println(sum/arr.length);
			
			Arrays.stream(arr).forEach(e->System.out.print(e+" "));
			System.out.println();
			
			Arrays.stream(arr).asDoubleStream().forEach(e->System.out.print(e+" "));
			
			Arrays.stream(arr).forEach(e->System.out.print(e+" "));
			System.out.println();
			
			Arrays.stream(arr).asLongStream().forEach(e->System.out.print(e+" "));
			
			
			int arr_sample2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 
		            10, 23, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; 
		  
		        System.out.println("\nExample of anyMatch"); 
		  
		        // Test whether any of the element in array is  
		        // divisible by 11 or not 
		        IntPredicate predicate = e->e % 11 == 0; 
		        System.out.println(Arrays.stream(arr_sample2) 
		                               .anyMatch(predicate)); 
		        
		        int arr_sample3[] = { 2, 4, 6, 8, 10 }; 
		        int arr_sample4[] = { 1, 3, 5, 7, 11 }; 
		        
		        System.out.println(Arrays.stream(arr_sample3).allMatch(e->e%2==0));
		        System.out.println(Arrays.stream(arr_sample4).allMatch(e->e%2==0));
		        System.out.println(Arrays.stream(arr_sample4).noneMatch(e->e%2==0));
		        */
		
		    List<Integer> a=Arrays.asList(1,2,3);
		    List<Integer> b=Arrays.asList(5,7);
		    List<Integer> c=Arrays.asList(3,8,4);
		    
		    List<List<Integer>> list=Arrays.asList(a,b,c);
		    System.out.println("Before flatmap"+list);
		    
		    List<Integer> listflap=list.stream()
		    .flatMap(lists->lists.stream()).collect(Collectors.toList());
		    System.out.println("after flatmap"+listflap);
		        
		Arrays.asList(1, 2, 3)
	      .stream().map(String::valueOf)
	      .map(s ->s.charAt(0));
		   System.out.println();
		   
		   Stream<String> str=Stream.of("syam","prasad","pandi");
		   str.forEach(s->System.out.print(s+" "));
		   System.out.println();
		   Stream<String> str1=Stream.<String>builder()
				   .add("vassu").add("vassu1").add("vassu1").build();
		   str1.forEach(k->System.out.print(k+" "));
		   System.out.println();
		   
		   List<String> alpha = Arrays.asList("a", "b", "c", "d");
		   //List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		   List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
	        System.out.println(collect);
		
	}

}
