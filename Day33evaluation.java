package gitshare;
import java.util.ArrayList;

enum level{
EASY,MEDIUM,HARD}

public class Day33evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1

	Database2 db = Database2.getInstance();
	db.getConnection();
	
	//Question 2
	
	//Define a array list and loop through it
	
	ArrayList <String>birds = new ArrayList<>();
	birds.add("peacock");
	birds.add("pigeon");
	System.out.println(birds);
	
	for (int i = 0; i < birds.size(); i++) {
		System.out.println (birds.get(i));
	}
	
	
	//Question 3
	//One program for try catch
	
	int[]numbers = {10,20,30,40,50};
	
	try {
		System.out.println(numbers[0]);
		System.out.println(numbers[5]);
		System.out.println(5/0);
	}
	
	catch(Exception e) {
		System.out.println("Wrong");
		System.out.println(e.getMessage());
		
	}
	
	//Question 4
	
	System.out.println(level.EASY);
	System.out.println(level.MEDIUM);
	System.out.println(level.HARD);
	
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
		
		
		public void getConnection() {
			System.out.println("You are connected to database");
		}
		

		
		
	}

	


