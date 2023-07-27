package gitshare;

public class Day30cfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program 6 : Exception handling- try,catch,finally
		
		System.out.println("hello");
		
		try {
			System.out.println(5/5);
		}
		
		catch (Exception e) {
			System.out.println("Exception managed successfully");
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		finally {
			System.out.println("I will be executed whatsoever");
		}
		

	}

}
