package gitshare;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsRestAssure2 {

	public static void main(String[] args) {

		List<PersonY> people = new ArrayList<>();
		people.add(new PersonY("arina", "joshi", 23));
		people.add(new PersonY("Jyoti", "pradhan", 25));
		people.add(new PersonY("soni", "baidya", 21));
		people.add(new PersonY("roshini", "amatya", 43));
		people.add(new PersonY("santosh", "thapa", 25));
		people.add(new PersonY("soni", "baidya", 21));

		// Program 1
		// Filtering - Get people older than 20

		List<PersonY> above20 = people.stream().filter(x -> x.getAge() > 20).collect(Collectors.toList());
		// System.out.println(above20);

		above20.stream().forEach(x -> System.out.println(x.displayName()));
		// above30.forEach(x -> System.out.println(x.displayName()));

		// Program 2
		// Filtering based on name:"Soni"

		List<PersonY> filterOnName = people.stream().filter(x -> x.displayName().contains("soni"))
				.collect(Collectors.toList());
		// System.out.println(filterOnName);
		filterOnName.forEach(x -> System.out.println(x.displayName()));

		// Program 3
		// Collecting only the names in one list

		List<String> names = people.stream().map(x -> x.firstName).collect(Collectors.toList());
		names.forEach(x -> System.out.println(x));
		System.out.println(names);

		// Program 4
		// Average age

		List<Integer> ages = people.stream().map(x -> x.age).collect(Collectors.toList());
		System.out.println(ages);
		int sum = ages.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum / people.size());

		// Short-cut Method

		int avg = people.stream().map(x -> x.age).collect(Collectors.toList()).stream().reduce(0,
				(x, y) -> x + y / people.size());
		System.out.println(avg);

		/******************************************************************************/

		// Program 5
		// Sorting the people in ascending by their age

		List<Integer> ages2 = people.stream().map(x -> x.age).collect(Collectors.toList());
		System.out.println(ages2);
		List<Integer> sortedAge = ages2.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted in ascending  order: " + sortedAge);

//To sort in descending order, you can use the reversed order of the natural order
		
         List<Integer> reversedList = ages2.stream()
                 .sorted((a, b) -> b.compareTo(a))
                 .collect(Collectors.toList());

         System.out.println("Sorted in descending order: " + reversedList);
         

		// Program 6
		// Count the number of people with same age

		Map<Integer, Long> ageCountMap = people.stream()
				.collect(Collectors.groupingBy(PersonY::getAge, Collectors.counting()));

		// Print the count of people with each age
		ageCountMap.forEach((age, count) -> {
			System.out.println("Age " + age + ": " + count + " people");
		});

		// Program 7
		// Name of first 3 people where age>30

		List<PersonY> ageGreaterThan30 = people.stream().filter(x -> x.getAge() > 30).limit(3)
				.collect(Collectors.toList());
		List<String> names30 = ageGreaterThan30.stream().map(x -> x.displayName()).collect(Collectors.toList());
		System.out.println(names30);

		// Short-cut

		List<String> names30B = people.stream().filter(x -> x.getAge() > 30).limit(3).map(x -> x.displayName())
				.collect(Collectors.toList());

		System.out.println("Names of the first 3 people with age > 30: " + names30B);

		// Program 7
		// Distinct name list

		List<String> names2 = people.stream().map(x -> x.displayName()).collect(Collectors.toList());
		List<String> distinctName = names2.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctName);

	}

}

class PersonY {
	String firstName;
	String lastName;
	int age;

	public PersonY(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public String displayName() {
		return (this.firstName + this.lastName);
	}

	public int getAge() {
		return this.age;
	}
}

//Collectors.groupingBy(classifierFunction)-
//The Collectors.groupingBy collector in Java is used to group elements from a
//stream into a map based on a provided classifier function

//classifierFunction: A function that classifies elements based on a certain
//criteria. Elements with the same classification are grouped together in the
//resulting map.

