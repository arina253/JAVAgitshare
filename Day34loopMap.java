package gitshare;

import java.util.Map;
import java.util.HashMap;

public class Day34loopMap {

	public static void main(String[] args) {
		
		//Map is a interface which is implemented by HashMap
		
		//Looping via Map
		
		//Program 1
		
		Map <String,String>course = new HashMap <String,String>();
		//Map <String,String>course = new HashMap <>();
		course.put("course","javascript");
		course.put("coursetwo", "python");
		course.put ("coursethree","SQL");
		course.put("coursefour", "python");
		course.put("coursefive","selenium");
		
		//Looping
		
		for (Map.Entry<String, String>entry:course.entrySet()){
			System.out.println(entry.getKey()+ entry.getValue());
		}
		
		//Program 2
		
		Map <String,String>students = new HashMap <String,String>();
		students.put("firstName", "arina");
		students.put("lastName","joshi" );
		students.put("rollNo", "24");
		students.put("interest", "game");
	    students.put("age", "35");
	    
	    //Looping
	    
	    for (String key: students.keySet()) {
	    	System.out.println(key);
	    }
	    
	    for (String values: students.values()) {
	    	System.out.println(values);
	    }
			
	    
	    //Program 3
	    
	    Map <String,String>Vehicle = new HashMap <String,String>();
	    Vehicle.put("name", "toyota");
	    Vehicle.put("model", "camry");
	    Vehicle.put("color", "silver");
	    
	    System.out.println(Vehicle);
	    
	 // Accessing specific values using keys
	    
	    System.out.println(Vehicle.get("color"));
	    System.out.println(Vehicle.get("model"));
	    System.out.println(Vehicle.get("name"));
	    
	    //Looping
	    
	    for (String key: Vehicle.keySet()) {
	    	System.out.println(key);
	    	System.out.println(Vehicle.get(key));
	    }
	    
	    //Iterator
	    
	    for (Map.Entry<String, String>entry:Vehicle.entrySet()){
	    	System.out.println(entry.getKey()+ entry.getValue());
	    	
	    }
	    		
	    
	    
	    
	    
		

	}

}
