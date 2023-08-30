package gitshare;

public class Aug20Testd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5) Overriding
		
		NAB bank = new NAB("Nepal","Kathmandu");
		System.out.println(bank.country);
		System.out.println(bank.branch);
		
		bank.loan();
		bank.save();
		
		

	}

}

class RashtraBankB{
	String country;
	
	public RashtraBankB(String cn) {
		this.country = cn;
	}
	
	public void loan() {
		System.out.println("Loan method from RB");
	}
	
	public void save() {
		System.out.println("Save method from RB");
	}
}

class NAB extends RashtraBankB{
	String branch;

	public NAB(String cn,String b) {
		super(cn);
		this.branch = b;
		}
	
	public void loan() {
		System.out.println("Loan method from NAB");
		super.loan();
	}
	
	public void save() {
		System.out.println("Save method from NAB");
		super.save();
	}
	
	
	
}
