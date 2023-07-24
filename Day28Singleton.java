package gitshare;


public class Day28Singleton {

	public static void main(String[] args) {
		
		Database1 db1 = Database1.getInstance();
		
		db1.getConnection();
		
		}
}
		
		
		
class Database1{
	
	private static Database1 dbObject = null;
		private Database1 (){
			
		}
		
		public static Database1 getInstance() {
			if (dbObject == null) {
				dbObject = new Database1();
			}
			return dbObject;
		}
		
		public void getConnection() {
			System.out.println("You are connected to database");
		}
		
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
