package gitshare;

public class TEST4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MotherM Sabi = new MotherM ("sita","joshi","sabita");
		Sabi.displayGname();
		Sabi.displayMname();
		
		
		
		SonS Sri = new SonS("sita","joshi","sabita","sri");
		Sri.displayGname();
		Sri.displayMname();
		
		
		
		
		
		

	}

}
 //1 ) INHERITANCE MULTILEVEL

class GrandmotherG{
	String firstName;
	String lastName;
	
	public GrandmotherG (String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayGname() {
		System.out.println(this.firstName + this.lastName);
	}
}

class MotherM extends GrandmotherG{
	String mfirstName;
	
	public MotherM (String fn,String ln, String mfn) {
		super (fn,ln);
		this.mfirstName= mfn;
	}
	
	public void displayMname() {
		System.out.println(this.mfirstName + this.lastName);
}
}

class SonS extends MotherM{
	String sfirstName;
	
	public SonS (String fn,String ln, String mfn, String sfn) {
		super (fn,ln,mfn);
		this.sfirstName = sfn;
	}
	
	public void displaySname() {
		System.out.println(this.sfirstName + this.lastName);
}
}