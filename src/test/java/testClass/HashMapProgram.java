package testClass;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) {

//		Hashmap has Key and Value Pair
//		Hashmap override the Keys and last one will be the latest one
//		Hasmap doesn't has a order
		HashMap<String, String> names = new  HashMap<>();
		names.put("Mayank", "Automation");
		names.put("Shreya", "Manual");
		names.put("Syed", "Manual");
		
		names.remove("Shreya");

		System.out.println(names);
	}

}
