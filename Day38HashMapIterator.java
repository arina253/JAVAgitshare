package gitshare;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Day38HashMapIterator {

	public static void main(String[] args) {
		
		
		//HashMap stores value in the form of key-value pair
		
		//Program 1
		
		HashMap<String,Integer>HashMapone = new HashMap<>();
		
		System.out.println(HashMapone);
		
		
		//add--------key & value
		HashMapone.put("one",1);
		HashMapone.put("two", 2);
		HashMapone.put("three", 3);
		HashMapone.put("four", 4);
		HashMapone.put("five", 5);
		
		System.out.println(HashMapone);
		
		
		//update--------key & value
		HashMapone.put("two", 22);
		HashMapone.put("five", 55);
		
		System.out.println(HashMapone);
		
		
		//retrieve---getting the value, use get()
		HashMapone.get("two");
		System.out.println(HashMapone.get("two"));
		
		int a = HashMapone.get("five");
		System.out.println(a);
		
		
		//delete ------key&value-----remove()
		HashMapone.remove("five");
		System.out.println(HashMapone);
		
		
		//Can we allow duplicate keys in HashMap?
		
	   HashMapone.put ("two",200);
	   System.out.println(HashMapone);
	   
	   //We cannot allow duplicate keys but the value gets updated.
	   
	   
	   //How many key values are there in HashMap?-----size()
	   
	   HashMapone.size();
	   System.out.println(HashMapone.size());
	   
	   
	   //Program 2
	   
	   HashMap <String,String>hashMapTwo = new HashMap<>();
	   
	   hashMapTwo.put("Na", "sodium");
	   hashMapTwo.put("K", "potassium");
	   hashMapTwo.put("Fe", "iron");
	   hashMapTwo.put("Ca", "calcium");
	   
	   //To check whether a key exists or not
	   //containsKey() and containsValue() return boolean values
	   
	   //Method 1
	   
	   boolean b = hashMapTwo.containsKey("Na");
	   System.out.println(b);
	   
	   //Method 2
	   
	   if (hashMapTwo.containsKey("Na")) {
		   System.out.println(hashMapTwo.get("Na"));
		   }
	   
		   if (hashMapTwo.containsValue("sodium")) {
			   System.out.println("value available");
			   
		   }
		   
		   //Looping via forEach
		   
		   for (String key:hashMapTwo.keySet()) {
			   System.out.println(key);
			   System.out.println(hashMapTwo.get(key));
		   }
		   
		   for (String values:hashMapTwo.values()) {
		   System.out.println(values);
		   }
		   
		   //For printing key and values, no iteration
		   
		   System.out.println(hashMapTwo.keySet());
		   System.out.println(hashMapTwo.values());
		   
		   // Looping via entrySet()
		   
		   for (Map.Entry<String, String>entry:hashMapTwo.entrySet()) {
			   System.out.println(entry.getKey());
			   System.out.println(entry.getValue());
			   System.out.println(entry.getKey()+ " " + entry.getValue());
		   }
		   
		   
		   
		   //Iterator
		   
		 //  Use of HashMap in Java and  iterate over its entries using an iterator. 
		   
		   HashMap<String,String>names = new HashMap<>();
		   
		   names.put("esha", "shrestha");
		   names.put("sweta","joshi");
		   names.put("jyoti", "baidya");
		   names.put("raju", "maskey");
		   names.put("abha","shakya");
		   
		   System.out.println(names);
		   
		   //Creating iterator on HashMap
		   //Name of iterator: itr
		   
		   Iterator<Map.Entry<String, String>>itr = names.entrySet().iterator();
		   while (itr.hasNext()) {
			   Map.Entry<String, String>entry = itr.next();
			   System.out.println(entry.getKey());
			   System.out.println(entry.getValue());
			   
			   System.out.println(entry.getKey()+ " " + entry.getValue());
		   }
		   
		   
		   
		}

}
