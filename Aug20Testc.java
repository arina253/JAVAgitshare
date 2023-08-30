package gitshare;

public class Aug20Testc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4)Overloading
		
		CalculatorX cal = new CalculatorX();
		cal.addition(2, 4);
		cal.addition(2, 4, 6);
		cal.addition(2, 4, 6, 8);
		
		
		
	}

} 

class CalculatorX{
	
	public static void addition (int a,int b) {
		System.out.println(a + b);
	}
	
	public static void addition (int a,int b,int c) {
		System.out.println(a + b + c);
	}
	public static void addition (int a,int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
}