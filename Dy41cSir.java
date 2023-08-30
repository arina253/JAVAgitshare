package gitshare;
    import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class Dy41cSir {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
				FileReader reader = new FileReader("example.txt");
				BufferedReader bufferReader = new BufferedReader(reader);
				//String line;
				
				try {
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
////					
//					while(bufferReader.readLine() != null) {
//						System.out.println(bufferReader.readLine());
//						System.out.println("\n");
//						
//					}
					
					String line = bufferReader.readLine();
					 
					while(line != null) {
						System.out.println(line);
						line =  bufferReader.readLine();
					}
					
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
//					System.out.println(bufferReader.readLine());
				    bufferReader.close();
					
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} 
			
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}

	}