package gitshare;
import java.io.FileWriter;
import java.io.IOException;

public class Day41FileWriter {

	public static void main(String[] args) {
		
		String fileName = "example.txt";
		
		try {
			FileWriter writer = new FileWriter (fileName);
			//Write into the file
			writer.write("Hello all");
			writer.write("\n");
			writer.write("I am learning computer");
			writer.write("\n");
			writer.write("I am learning javascript");
			writer.write("\n");
			writer.write("I am learning java");
			writer.write("\n");
			writer.write("I am learning python");
			writer.write("\n");
			writer.write("I am learning sql");
			writer.write("\n");
			writer.close();
			System.out.println("Data is successfully written and file is closed");
		}
		
		catch (IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
		}
		
	}

}
