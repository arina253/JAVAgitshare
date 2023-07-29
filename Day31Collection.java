package gitshare;

import java.util.ArrayList;

public class Day31Collection {

	public static void main(String[] args) {

		// COLLECTION

		// Defining a arraylist of string

		ArrayList<String> language = new ArrayList<>();

		// Adding the value to ArrayList

		language.add("java");
		language.add("python");
		language.add("javascript");
		language.add("selenium");
		System.out.println(language);

		// [java, python, javascript, selenium]
		// 0 1 2 3

		// Retrieving the value of ArrayList

		String a = language.get(0);
		String b = language.get(1);
		String c = language.get(2);
		String d = language.get(3);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		// Other Method: via loop

		for (int i = 0; i < language.size(); i++) { // length is not recognized
			// System.out.println(i);
			System.out.println(language.get(i));
		}

		// Updating the value from ArrayList

		ArrayList<String> animals = new ArrayList<>();
		animals.add("Cat");
		animals.add("Lion");
		animals.add("Donkey");
		animals.add("Goat");

		System.out.println(animals);

		animals.set(3, "Dog");
		System.out.println(animals);

		// Deleting the value from ArrayList

		animals.remove(1);
		System.out.println(animals);

	}

}
