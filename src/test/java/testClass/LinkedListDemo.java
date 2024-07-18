package testClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> names = new  LinkedList<String>();
		names.add("Mayank");
		names.add("Shreya");
		names.add("Neel");
		names.add("Lata");

//		names.removeFirst();
		
		Object[] namearray = names.toArray();
		
		for(Object arr :namearray) {
		System.out.println(arr);
		
		
	}
	}
}
