package gitshare;

public class Day39instanceof {

	public static void main(String[] args) {

		// instanceof
		/*
		 * instanceof operator is used to verify the relationships between classes in
		 * terms of their inheritance hierarchy.
		 */

		Sparrow s = new Sparrow();

		System.out.println(s instanceof Sparrow); // True
		System.out.println(s instanceof Birds); // True

		// s is an instance of sparrow and birds
		
		Invoice inv = new Invoice(123,"ari","joshi","23456","8976");
		System.out.println(inv instanceof Invoice);
		

	}

}

class Birds {

}

class Sparrow extends Birds {

}

//class with constructor

class Invoice {

	int billNo;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;

	

	public Invoice(int bn , String fn ,String ln ,String phoneNo,String adress) {
		this.billNo = 123;
		this.firstName = "ari";
		this.lastName = "joshi";
		this.phoneNumber = "23456";
		this.address = "8976";
			
	}



	
}
