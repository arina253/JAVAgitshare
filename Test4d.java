package gitshare;

public class Test4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass p = new OuterClass();
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.a + p.b);
		
		
		OuterClass.InnerClass q = p.new InnerClass() ;
		System.out.println(q.x);
		System.out.println(q.y);
		System.out.println(q.x + q.y);
		
		
	}

}
 //4) INNER CLASS

class OuterClass{
	int a = 5;
	int b = 10;
	
	class InnerClass{
		int x = 5;
		int y = 20;
	}
	

}