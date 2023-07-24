package gitshare;

public class Test4f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator.multiplication (2,4);
		Calculator.multiplication (2,4,6);
		Calculator.multiplication (2,4,6,8);
		
		

	}

}

//6) Overloading

class Calculator{
	
	public static void multiplication (int a, int b) {
		System.out.println(a * b);
	}
	
	public static void multiplication (int a, int b, int c) {
		System.out.println(a * b *c);
	}
	
	public static void multiplication (int a, int b, int c,int d) {
		System.out.println(a * b * c *d);
	}
}
