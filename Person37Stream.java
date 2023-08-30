package gitshare;

import java.util.List;
import java.util.stream.Collectors;

public class Person37Stream {

	public static void main(String[] args) {
		
		List <PersonZ> peoples =  List.of(
				new PersonZ ("ram joshi",45,"kathmandu"),
				new PersonZ ("sam rai",55,"pokhara"),
				new PersonZ ("ramu rao",65,"butwal"),
				new PersonZ ("balram shakya",25,"chitwan"),
				new PersonZ ("ramita chhetri",15,"nagarkot")
				);
		
		
		//Program 1
		//List of persons above 30 age-----Filtering by age
		
		List<PersonZ>above30Age = peoples.stream().filter(person -> person.getAge()> 30).collect(Collectors.toList());
				
		System.out.println(above30Age);    
		//[gitshare.PersonZ@2eafffde, gitshare.PersonZ@59690aa4, gitshare.PersonZ@6842775d]
		
		for (int i = 0; i < above30Age.size();i++) {
			System.out.println(above30Age.get(i).getfullName());
			System.out.println(above30Age.get(i).getAge());
			System.out.println(above30Age.get(i).getCity());
			
		}
		
		
		//Program 2
		//Map and collect fullname-------Mapping full names
		//["ram joshi","sam rai","ramu rao","balram shakya","ramita chhetri"]
		
		List <String> names = peoples.stream().map(person -> person.getfullName()).collect(Collectors.toList());
		
		for (String nm : names) {
			System.out.println(nm);
		}
		
		
		//Program 3
		//Person and city----------Mapping full names & city
		// "ram joshi : kathmandu"
		
		List <String> nc = peoples.stream()
				.map(person -> person.getfullName()
				.concat(" :")
				.concat(person.getCity()))
				.collect (Collectors.toList());
				
				for (String a: nc) {
					System.out.println(a);
				}

	}

}

class PersonZ{
	
	private String fullName;
	 private int age;
	 private String city;
	 
	 public PersonZ(String fn,int age,String ct) {
		 this.fullName = fn;
		 this.age = age;
		 this.city = ct;
	 }
	 
	 public String getfullName() {
		 return fullName;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
	 public String getCity() {
		 return city;
	 }
	
}


/**************************************************************************************************************/


//List.of()
//.collect (Collectors.toList())


