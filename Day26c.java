package gitshare;

//MORE THAN ONE INTERFACE
//MULTIPLE IMPLEMENTATION

interface WBA{
	public void save();
	public void loan();
}

interface WBI{
	public void displayCountry();
	public void displayCity();
	
}
public class Day26c {

	public static void main(String[] args) {
		
		Bank KTM = new Bank();
		KTM.displayCity();
		KTM.displayCountry();
		KTM.loan();
		KTM.save();
		
	}

}

//More than one interface can be implemented by a class

class Bank implements WBA,WBI{
	
	public void displayCountry() {
		System.out.println("Nepal");
	}
	
	public void displayCity() {
		System.out.println("Kathmandu");
	}
	
	public void save() {
		System.out.println("Save method");
	}
	
	public void loan() {
		System.out.println("Loan method");
	}
}


//Class cannot inherit multiple classes but class can implement more than one interface
//at a time.
