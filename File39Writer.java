package gitshare;

import java.io.FileWriter;
import java.io.IOException;

public class File39Writer {

	public static void main(String[] args) {

		
		try {
			FileWriter write = new FileWriter ("MyFile.txt",true);
//			System.out.println(10/0);
			write.write("Namaskar");
			write.write("\n");
			write.write("Namaskar to all");
			write.write("Take care");
			System.out.println("Successfully written");
			write.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();       //java.lang.ArithmeticException
			System.out.println(e.getMessage());   /// by zero
		}
		
		
//		catch(Arithmetic Exception e){
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}

		
	}

//While reading/writing,we use try catch block
//Try catch block should be surrounded by close operation ,otherwise file is corrupted

//IOException -----Input output exception for file
//e.printStackTrace()------Predefined method for exception
//                  -------Gives reason for why exception occurs
//                  ------shows error message while handling exceptions
// "\n" -------------------Move to the next line

