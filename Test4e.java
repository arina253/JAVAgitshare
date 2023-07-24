package gitshare;

public class Test4e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Database db3=Database.getInstance();
		db3.getConnection();

	}

}

class Database{
	
	private static Database dbObject;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if (dbObject == null) {
			dbObject = new Database ();
		} 
		return dbObject;
	}
	
	public void getConnection() {
		System.out.println("We are connected to database");
	}
}
