package gitshare;

public class Aug20Testa {

	public static void main(String[] args) {
		
		//1)Multidimensional array
		
		int[][]numbers = {
				{11,22,33},
				{44,55,66},
				{77,88,99}
				};
		
		for (int[]numbers1:numbers) {
			for (int numbers2:numbers1) {
				System.out.println(numbers2);
			}
		}
		
		
		//2)Singleton pattern
		
		DatabaseZ db1 = DatabaseZ.getObject();
		db1.connection();
		
		

	}

}

class DatabaseZ{
	private static DatabaseZ obj;
	
	private DatabaseZ() {
		
	};
	
	public static DatabaseZ getObject() {
		if (obj == null) {
			obj = new DatabaseZ();
		}
		return obj;
	}
	public void connection() {
		System.out.println("Connected");
	}
	
}
