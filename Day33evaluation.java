package gitshare;
import java.util.ArrayList;

public class Day33evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

}
	
}
	


class Database2{
	
	private static Database2 dbObj= null;
		
		private Database2() {
			
			}
		public static Database2 getInstance() {
			if (dbObj == null) {
				dbObj = new Database2();
			}
			return dbObj;
		}
		
		// make a  method to call on object
		public void getConnection() {
			System.out.println("You are connected to database");
		}
		

		
		
	}
	


