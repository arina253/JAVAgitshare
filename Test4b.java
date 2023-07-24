package gitshare;

public class Test4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ABC A = new ABC();
		A.loan();
		A.save();
		A.Greet();

	}

} 

//2) Abstract class

abstract class RashtraBank{
	
	abstract void loan();
	abstract void save();
	
	public void Greet() {
		System.out.println("Welcome to our family");
	}
}

class ABC extends RashtraBank{
	
	public void loan(){
		System.out.println("I am loan method from ABC");
	}
	
	public void save() {
		System.out.println("I am save method from ABC");
		
	}
}
