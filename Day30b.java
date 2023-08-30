package gitshare;

public class Day30b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Program 3
		
//		System.out.println("Define a array with values");
//		int []numbers = {11,22,33,44};
//		
//		try {
//			System.out.println(numbers[0]);
//			System.out.println(numbers[5]);
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("Moving ahead after managing the exception");
//		

	
	
	//Program 4
	
//      System.out.println("Define a array with values");
//      int []numbers = {11,22,33,44};
//      
//      try {
//    	  System.out.println(numbers[0]);
//    	  System.out.println(numbers[5]);
//    	  System.out.println(6/0);
//      }
//      
//      catch (Exception e) {
//    	  System.out.println("please enter a valid input");
//    	  System.out.println(e.getMessage());
//      }
      
      
      
      //Program 5
	
      System.out.println("Define a array with values");
      int []numbers = {11,22,33,44};
      
      try {
    	  System.out.println(numbers[0]);
    	  System.out.println(6/0);
    	  System.out.println(numbers[5]);
      }
      
      catch ( ArithmeticException e) {
    	  System.out.println("please enter a valid input");
    	  System.out.println(e.getMessage());
    	 // e.printStackTrace();     //java.lang.ArithmeticException
      }
      
      catch (ArrayIndexOutOfBoundsException e) {
    	  System.out.println("please enter a valid index for array");
      }
      
      catch (Exception e) {
    	  System.out.println("Exception");
      }

      System.out.println("Moving ahead after handling exception");
	}

	}


