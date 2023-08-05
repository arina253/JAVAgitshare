package gitshare;

interface Course{
	public void courseOne();
	public void courseTwo();
	public void courseThree();
	public void courseFour();
	public void courseFive();
	
	}

 class Zorba implements Course{
	 @Override
	 public void courseOne() {
	 	System.out.println("Zorba One");
	 }

	 @Override
	 public void courseTwo() {
	 	System.out.println("Zorba Two");
	 }

	 @Override
	 public void courseThree() {
	 	System.out.println("Zorba Three");
	 	
	 }

	 @Override
	 public void courseFour() {
	 	System.out.println("Zorba Four");
	 	
	 }

	 @Override
	 public void courseFive() {
	 	System.out.println("Zorba five");
	 	
	 }
 }
	 
	 class Minskole implements Course{

		@Override
		public void courseOne() {
			System.out.println("Minskole one");
		}

		@Override
		public void courseTwo() {
			System.out.println("Minskole two");
		}

		@Override
		public void courseThree() {
			System.out.println("Minskole three");
			
		}
	 

		@Override
		public void courseFour() {
			System.out.println("Minskole four");
			
		}

		@Override
		public void courseFive() {
			System.out.println("Minskole five");
			
		}
		 
	 }



public class Day34MapInterface {

	public static void main(String[] args) {
		
	/*We cannot create object of abstract class/interface class but we can 
	create reference variable----Upcasting
	
	With the same reference variable of interface,we are creating object of
	implemented class*/
		
		Course firm;
		
		firm = new Zorba();
		firm.courseOne();
		firm.courseTwo();
		firm.courseThree();
		
		firm = new Minskole();
		firm.courseOne();
		firm.courseTwo();
        firm.courseThree();


	}

}

