package gitshare;

import two.Sizeee;
import two.TestSize;

enum SizeX{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}

public class Aug20Testh {

	public static void main(String[] args) {
		
		TestSizeX a = new TestSizeX (SizeX.SMALL);
		a.buyDress();
	}

}

class TestSizeX{
	String dress;
	
	public TestSizeX(String dr) {
		this.dress = dr;
	}
	
	public void buyDress() {
		switch (dress) {
		case "SMALL":
			System.out.println("Small size needed");
			break;
		case "MEDIUM":
			System.out.println("Medium size needed");
			break;
		case "LARGE":
			System.out.println("Large size needed");
			break;
		case "EXTRALARGE":
			System.out.println("Extralarge size needed");
		}
	}
}
