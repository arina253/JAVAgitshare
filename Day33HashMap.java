package gitshare;

import java.util.HashMap;

public class Day33HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// HashMap-to store key-value pairs and various operations performed on it. 

		HashMap<String, Integer> person = new HashMap<>();

		person.put("ram", 10);
		person.put("sam", 20);
		person.put("tom", 30);
		person.put("joe", 40);
		person.put("tim", 50);

		System.out.println(person);

		// Accessing the value from HashMap-get()

		int a = person.get("tim");
		System.out.println(a);

		// Checking particular key exists from HashMap - contains()

		boolean b = person.containsKey("tom");
		System.out.println(b);

		// total number of key value in HashMap - size()

		int c = person.size();
		System.out.println(c);

		// remove the value from HashMap

		person.remove("tim");
		System.out.println(person);

		// Update the value in HashMap

		person.put("tom", 70);
		System.out.println(person);

		// Looping through HashMap

		System.out.println(person.values());
		System.out.println(person.keySet());
		
		

		// Looping through values
		
/*****************************************************************************/		

//		for (int i = 0; i < person.values().size(); i++) {
//			System.out.println(i);
//		}
//
//		// while
//
//		int i = 0;
//		while (i < person.values().size()) {
//			System.out.println(i);
//			i++;
//		}
		//just printing the loop variables i,so doesn't make any sense
		
/*******************************************************************************/
		
		
		//for each
		
		for (int values : person.values()) {
			System.out.println(values);
		}
		
		

		// Looping through keyset
		

		for (String key : person.keySet()) {
			System.out.println(key);
		}
	}
}
