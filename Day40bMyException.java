package gitshare;

public class Day40bMyException {

	public static void main(String[] args) {
		
		//User defined Exception
		
		//Exception-Inbuilt class
		
		//Driver Program
		
		try {
			String password = "arinaaaa";
			if (password.length() < 8) {
				throw new MyException("password length is small");
			}
			
			String mobile = "980375349";
			if (mobile.length()<10) {
				throw new MyException("moblile length is less");
			}
			System.out.println("User registered");
			
		}
		
		catch(Exception e){
			System.out.println("Function called");
			System.out.println("caught");
			e.printStackTrace();
		    e.getMessage();
		
			}
		
}
	
}

class MyException extends Exception{
	public MyException (String s) {
		
		//Calling constructor of parent Exception
		super(s);
	}
}


class InvalidMobileNumber extends Exception {
public InvalidMobileNumber (String s) {
	super(s);
}

}

/* The inherited class 'Exception' is a predefined/inbuilt  class.
 * throw is used to write what message should be displayed so that catch keyword can
 * display the same message in run time.
 * new keyword is used to create new object of class 'My Exception'*/
