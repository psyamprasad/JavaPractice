import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class StringCountAndPrintUnique {

	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int n=Integer.parseInt(sc.nextLine());
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			String st=sc.nextLine();
			str[i]=st;
			
		}
		process(str);
	}

	private static void process(String arr[])
	{
		/*
		 * System.out.println(Arrays.toString(arr)); int count; for(int
		 * i=0;i<arr.length;i++) { count=1; for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i].equals(arr[j])) { count++; arr[j]="0";
		 * 
		 * }
		 * 
		 * } if(count>1&&arr[i]!="0") { System.out.println(arr[i]); }
		 * 
		 * }
		 */
		System.out.println(Arrays.toString(arr)); 
		Map<String,Integer> map=new TreeMap<>();
		//Map<String,Integer> map=new HashMap<>();
		for(String str:arr)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
				
			}
			else
			{
				map.put(str, 1);
			}
			
		}
		
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Map.Entry<String,Integer> ent:set)
		{
			if(ent.getValue()>1)
			{
				System.out.println(ent.getKey());
				
			}
			
		}
		
		}

}
