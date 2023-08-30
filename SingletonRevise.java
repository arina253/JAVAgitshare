package gitshare;

public class SingletonRevise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Database10 db1 =Database10.getObject();
		 System.out.println(db1);
		 db1.connect();

	}

}

class Database10{
	
	private static Database10 obj;  //This is the static reference to the single
	                                //instance of the Database10 class.
		
	
	private Database10(){  //ensures that the class can only be instantiated from
		                   //within the class.
		}

	public static Database10 getObject() { //This method is used to get the single 
		                                    //instance of the Database10
		                                   
		if (obj == null) {
			obj = new Database10();
		}
		return obj;
		
	}
	
	public void connect() {
		System.out.println("connected");
	}
		
	}
	

