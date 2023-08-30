package gitshare;

abstract class WorldBankQ{
	
	abstract void deposit();
	abstract void save();
	
}

public class Aug20Testf {

	public static void main(String[] args) {
		
		//7) Abstraction
		
		HNB hyderabad = new HNB();
		hyderabad.save();
		hyderabad.deposit();
		
	}

}

class HNB extends WorldBankQ{

	
	void deposit() {
		System.out.println("Deposited from HNB");
		
	}

	void save() {
		System.out.println("Saved from HNB");
		
	}
	
  
}
