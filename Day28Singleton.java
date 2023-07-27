package gitshare;


public class Day28Singleton {

	public static void main(String[] args) {
		
		Database1 db1 = Database1.getInstance();
		
		db1.getConnection();
		
		}
}
		
		
		
class Database1{
	
	//make a private reference variable
	
	private static Database1 dbObject = null;
	
	//make a private constructor
		private Database1 (){
			
		}
		
		//make a static method which returns dbObject
		
		public static Database1 getInstance() {
			if (dbObject == null) {
				dbObject = new Database1();
			}
			return dbObject;
		}
		
		// make a  method to call on object
		public void getConnection() {
			System.out.println("You are connected to database");
		}
		
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
