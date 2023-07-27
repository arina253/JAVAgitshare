package gitshare;

public class Day30exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXCEPTION HANDLING
		
		//Program 1: without exception
		
		//System.out.println("hello");
		//System.out.println(6/0);
		//System.out.println("Thank you");
		
		
		
		
		//Program 2: with exception
		
		System.out.println("hello");
		try {
			int divideByZero = 6/0;
			System.out.println("Rest of code in try block");
			System.out.println("Rest of code in try block 2");
			System.out.println("Rest of code in try block 3");
			System.out.println("Rest of code in try block 4");
			}
		
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thank you");
		

	}

}
