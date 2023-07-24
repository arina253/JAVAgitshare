package gitshare;

interface RashtraBankK{
	public void loan();
	public void save();
}

public class Test4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NIBA B = new NIBA();
		B.loan();
		B.save();

	}

}


//3) INTERFACE

class NIBA implements RashtraBankK{
	public void loan(){
		System.out.println("Loan method");
	}
	
	public void save() {
		System.out.println("Save method");
		}
	
}