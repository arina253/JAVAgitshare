package gitshare;

//Inheritance and Implementation at same time.

interface Three{
	public void methodThree();
}

interface Four{
	public void methodFour();
}

interface Five{
	public void methodFive();
}



public class Day26d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seven objSeven = new Seven();
		objSeven.SixA();
		objSeven.SixB();
		objSeven.methodThree();
		objSeven.methodFour();


	}

}

class Six{
	public void SixA() {
		System.out.println("This is first method for class six");
	}
	
	public void SixB() {
		System.out.println("This is second method for class six");
	}
	
}
	
	class Seven extends Six implements Three,Four{

		
		public void methodFour() {
			System.out.println("This is the method from interface four");
			
		}

		
		public void methodThree() {
			System.out.println("This is the method from interface three");
			
			
			
		}
	}
		
	
