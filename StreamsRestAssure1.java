package gitshare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsRestAssure1 {

	public static void main(String[] args) {

		// Program 1
		// Print the names of person with more than four characters

		// ["arina","ram","ramesh","satish"]=====Output : ["arina","ramesh","satish"]

		List<String> names = Arrays.asList("arina", "ram", "ramesh", "satish");
		List<String> longNames = names.stream().filter(name -> name.length() > 4).collect(Collectors.toList());
		System.out.println(longNames);

		// Program 2

		List<Integer> transactions = Arrays.asList(11, 22, 33, -56, -67, 89, 68);
		List<Integer> deposits = transactions.stream().filter(t -> t > 0).collect(Collectors.toList());
		System.out.println(deposits);

		List<Integer> withdrawal = transactions.stream().filter(t -> t < 0).collect(Collectors.toList());
		System.out.println(withdrawal);

		// Program 3
		// Add 2 to each of the numbers

		// [1,2,3,4,5,6,7,8,9,10]=====>[3,4,5,6,7,8,9,10,11,12]

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> addTwo = numbers.stream().map(x -> (x + 2)).collect(Collectors.toList());
		System.out.println(addTwo);

		// Program 4

		List<Integer> birthYear = Arrays.asList(1989, 1990, 1991, 1992);
		List<Integer> ages = birthYear.stream().map(x -> 2023 - x).collect(Collectors.toList());
		System.out.println(ages);

		// Program 5

		List<Integer> multiplication = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> tableTwo = multiplication.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(tableTwo);

		// Program 6
		// Addition of all the numbers

		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers1.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum);

//		int[]nums = {11,22,33};
//		int total = 0;
//		for (int i = 0; i < nums.length; i++) {
//			total = total + nums[i];
//		}
//		System.out.println(total);
//			

		// Program 7
		List<String> na = Arrays.asList("arina", "jyoti", "roshini", "santosh");
		na.stream().forEach(name -> System.out.println("welcome" + name));

		/*
		 * Filter will not change any element of list or perform any operations
		 *  Map will work on every element of list and give another list 
		 *  forEach will not return anything ,just loop through it.
		 */

	}

}
