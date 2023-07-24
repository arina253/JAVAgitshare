package gitshare;

public class Test4g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MBA A = new MBA("xyz","kathmandu","newroad");
		A.deposit();
		A.withdraw();
		System.out.println(A.name);
		System.out.println(A.location);
		System.out.println(A.branch);

	}

}

//7) Overriding

class BankK{
	String name;
	String location;
	
	public BankK( String nm,String ln) {
		this.name = nm;
		this.location= ln;
	}
	
	public void withdraw() {
		System.out.println("Withdraw method");
	}
	
	public void deposit() {
		System.out.println("Deposit method");
	}
}

class MBA extends BankK{
	 String branch;
	 
	 public MBA(String nm, String ln, String br) {
			super(nm, ln);
			this.branch = br;
			}
	 
	 public void withdraw() {
		 System.out.println("Withdraw method from MBA");
	 }
	 
	 public void deposit() {
		 System.out.println("Deposit method from MBA");
	 }
}


