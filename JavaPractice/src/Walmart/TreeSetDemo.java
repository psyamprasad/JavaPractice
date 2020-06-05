package Walmart;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<>(); 

		treeSet.add("Geeks"); 
		treeSet.add("for"); 
		treeSet.add("Geeks"); 
		treeSet.add("GeeksforGeeks"); 

		for (String temp : treeSet) 
			System.out.printf(temp + " "); 

		System.out.println("\n"); 


	}

}
