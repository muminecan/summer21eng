package day19arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		List<String> list1 = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		System.out.println(list.contains("A"));// true==>if this list contains the specified element
		System.out.println(list.contains("X"));// false
		System.out.println(list.equals(list1));// true

		
		
		
		
		
		
		
	/*	Ask user to enter a letter
	 	If the letter exists in list1 convert it to "Got it"
	    otherwise add the element which user entered into the list1
	*/
		System.out.println(list1);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a letter");
		
	    String str = scan.next().toUpperCase().substring(0,1);
	   
		if(list1.contains(str)) {
			list1.set(list1.indexOf(str),"Got it");
			System.out.println(list1);
		}else {
			list1.add(str);
			System.out.println(list1);
		}
		
		
		
		
		
		
		
		
		
		
	
	}

}














