package gitshare;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define an ArrayList and add elements to it
		
		ArrayList <String>birds = new ArrayList<>();
		birds.add("Sparrow");
		birds.add("Peacock");
		birds.add("Pigeon");
		
		// Loop through the ArrayList and print each element
        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i));

	}

}
}
