package gitshare;

import java.util.ArrayList;

public class Day31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //ArrayList -------> int
		//ArrayList -------> string
		//ArrayList -------> boolean
		//ArrayList -------> person
		
		
		PersonP ram = new PersonP ("ram","rao");
		PersonP sam = new PersonP ("sam","rai");
		PersonP tom = new PersonP ("tom","joshi");
		PersonP hari = new PersonP ("hari","shakya");
		PersonP mohan = new PersonP ("mohan","chhetri");
		
		ArrayList <PersonP> students = new ArrayList <>();
		students.add(ram);
		students.add(sam);
		students.add(tom);
		students.add(hari);
		students.add(mohan);
		
		//Retrieving the ArrayList of PersonP
		
		students.get(0).display();
		
		//for
		
		for (int i = 0; i < students.size(); i++) {
			//System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).display();
		}
		
		//while
		
		int j = 0;
		while
			(j < students.size()){
			System.out.println(students.get(j).firstName);
			System.out.println(students.get(j).lastName);
			students.get(j).display();
			j++;
		}
			
		// for each
		
		for (PersonP A: students) {
	    System.out.println(A.firstName);
	    System.out.println(A.lastName);
	    A.display();
		}
			
		}
		
		
		
	
	}



class PersonP{
	String firstName;
	String lastName;
	
	public PersonP (String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		}
	
	public void display() {
		System.out.println(this.firstName + this.lastName);
	}
	
}
