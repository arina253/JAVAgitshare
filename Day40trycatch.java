package gitshare;

public class Day40trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("caught");
		}
		
		System.out.println("bye");

	}

}


//e.printStackTrace()----a method to get what type of error we will get as an exception
