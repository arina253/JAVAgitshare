package gitshare;

import java.util.Arrays;
import java.util.List;

public class StreamsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stream -API Testing
		
		//filter()
		
		//Program1
		
		//count of blank strings
		
		List <String>names = Arrays.asList("arina","jyoti","", "sony","","esha");
		System.out.println(names.stream().filter(x -> x.isEmpty()).count());
		
		
		// taking the blank string to list
		
		List<String>names2 = Arrays.asList("arina","jyoti","", "sony","","esha");
		System.out.println(names2.stream().filter(x -> x.isEmpty()).toList());
		
		
		//Only the string 
		
		List<String>names3 = Arrays.asList("arina","jyoti","", "sony","","esha");
		System.out.println(names.stream().filter(x -> !x.isEmpty()).toList());
		
		
		//names containing the letter s
		
		List<String>names4 = Arrays.asList("arina","jyoti","", "sony","","esha");
		System.out.println(names4.stream().filter(x -> x.contains("s")).toList());
		
		//names starting with a
		
		List<String>names5 = Arrays.asList("arina","jyoti","", "sony","","esha");
		System.out.println(names5.stream().filter(x ->x.startsWith ("a")).toList());
		
		
		//string greater than 4
		
		List<String>names6 = Arrays.asList("arina","jyoti","", "sony","","esha");
		System.out.println(names6.stream().filter(x -> x.length()>4).toList());
		
		
		//Program 2
		
		//withdrawal and deposit amount
		
		List <Integer> transactions = Arrays.asList(1000,-5000,3000,-6000,7890,-6543);
		System.out.println(transactions.stream().filter(tra -> tra > 0).toList());   //deposit
		System.out.println(transactions.stream().filter(tra -> tra < 0).toList());   //withdrawal
		
		
		         //Concept of working with every element of array
				//["ram","sam","hari"]------------------["RAM","SAM","HARI"]
				
				
				//Concept of not working with every element of array
				//["ram","sam","hari"]------------------["ram","sam",]
				
		
		//map()
		
		//Convert every list in map to Uppercase()
		
		List <String>countries = Arrays.asList("japan","nepal","india","norway","canada");
		System.out.println(countries.stream().map(nation -> nation.toUpperCase()).toList());
		
		
		//multiple of 5
		
		List <Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers.stream().map(x -> x * 5).toList());
		
		
		//doubling of salary
		
		List <Integer>salary = Arrays.asList(1000,2000,3000,4000,5000);
		System.out.println(salary.stream().map(sal -> sal * 2).toList());
		
		
		//10% bonus in each one's salary
		
		System.out.println(salary.stream().map(a -> a + a * 0.1).toList());

		
				

	}

}
