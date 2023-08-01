package gitshare;

import java.util.ArrayList;

public class Day32ArrayMethods {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		Methods:

		// add()

		names.add("arina");
		names.add("sarita");
		names.add("jyoti");
		names.add("roshini");
		names.add("mohan");

		System.out.println(names);

		boolean a = names.add("arina");
		System.out.println(a);

		// remove()

		// 0 1 2 3 4
		// [arina, sarita, jyoti, roshini, mohan]

		names.remove(0);
		System.out.println(names);

		names.remove("sarita");
		System.out.println(names);

		// clear()

		names.clear();
		System.out.println(names);

		names.add("kalpana");
		names.add("sabina");
		names.add("rabina");
		names.add("aparna");
		names.add("jyotsana");
		System.out.println(names);

		// [kalpana, sabina, rabina, aparna, jyotsana]

		// set()-replace

		names.set(1, "arina");
		System.out.println(names);

		// contains()

		boolean a1 = names.contains("arina");
		System.out.println(a1);

		// [kalpana, arina, rabina, aparna, jyotsana]

		// get()

		String elementAtIndex = names.get(1);
		System.out.println(elementAtIndex);

		// index of()

		// int num = names.indexOf(4);
		// System.out.println(num);--------Output: -1

		int num = names.indexOf("jyotsana");
		System.out.println(num);

		// size()

		// [kalpana, arina, rabina, aparna, jyotsana]

		int length = names.size();
		System.out.println(names);
		System.out.println(length);
		

		// indexOf()
		// lastIndexOf()

		names.add("kalpana");

		// [kalpana, arina, rabina, aparna, jyotsana, kalpana]

		System.out.println(names);

		System.out.println(names.indexOf("kalpana"));

		System.out.println(names.lastIndexOf("kalpana"));

		System.out.println(names.lastIndexOf("aparna"));

	}

}
