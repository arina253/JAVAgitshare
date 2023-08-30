package gitshare;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Day41FileReader {

	public static void main(String[] args) {

		try {

			FileReader reader = new FileReader("example.txt");
			BufferedReader bufferReader = new BufferedReader(reader);

			try {
				String line = bufferReader.readLine();
				
//				System.out.println(bufferReader.readLine());
//			    System.out.println(bufferReader.readLine());
//				System.out.println(bufferReader.readLine());
//			    System.out.println(bufferReader.readLine());
//				System.out.println(bufferReader.readLine());
//				System.out.println(bufferReader.readLine());
//				System.out.println(bufferReader.readLine());

			while (line != null) {
					System.out.println(line);
					line = bufferReader.readLine();
				}
				bufferReader.close();
			}

			catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
