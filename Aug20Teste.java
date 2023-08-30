package gitshare;

interface CourseZ{
	
	public void methodOne();
	public void methodTwo();
	
		}

public class Aug20Teste {

	public static void main(String[] args) {
		ZorbaZ qa = new ZorbaZ();
		qa.methodOne();
		qa.methodTwo();
	}

}

class ZorbaZ implements CourseZ{

	
	public void methodOne() {
		System.out.println("Method 1");
		
	}

	public void methodTwo() {
		System.out.println("Method 2");
		
	}
	
}
