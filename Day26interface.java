package gitshare;


interface WorldBankK{
	public void Save (int x);
	public void Loan (int y);
}

public class Day26interface{

	public static void main(String[] args) {
		SBIK India = new SBIK();
		India.Loan(0);
		India.Save(0);
		
		PNBK Panjab = new PNBK();
		Panjab.Loan(0);
		Panjab.Save(0);
		

	}

}

class SBIK implements WorldBankK{


	public void Save(int x) {
		System.out.println("This is save method for SBIK");
		
	}

	public void Loan(int y) {
		System.out.println("This is loan method for SBIK");
		
	}
	
}
 class PNBK implements WorldBankK{


	public void Save(int x) {
		System.out.println("This is save method for PNBK");
		
	}

	
	public void Loan(int y) {
		System.out.println("This is loan method for PNBK");
	}
		
	}