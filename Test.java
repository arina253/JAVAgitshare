package gitshare;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Define a arraylist and loop through it
		
		ArrayList<String>animals = new ArrayList<>();
		animals.add("dog");
		animals.add ("cat");
		animals.add("tiger");
		animals.add("elephant");
		
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
			
		}
		
		
		
		//Define a hashmap and loop through it 
		
		HashMap <String,String> employees = new HashMap<String,String>();
		employees.put("ram", "IT");
		employees.put("sam","office");
		employees.put("sita", "cook");
		employees.put("hari", "HR");
		
		System.out.println(employees.values());
		System.out.println(employees.keySet());
		
		for (String values:employees.values()) {
			System.out.println(values);
		}
		
		for (String keys: employees.keySet()) {
			System.out.println(keys);
		}
		
		//Second Method
		
		for (Map.Entry<String, String>entry: employees.entrySet()) {
			System.out.println(entry.getKey() + " " +  entry.getValue());
		}
		
				
	}

}
