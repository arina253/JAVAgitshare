package gitshare;

public class Aug20Testg {

	public static void main(String[] args) {
		
		//8)Exception handling
		
		try {
			System.out.println("Namaskar");
			System.out.println(6/0);
			System.out.println("Take care");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("I am executed whatsoever");
		}

	}

}
