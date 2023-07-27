package gitshare;

//ENUM WITH ITS OWN METHOD

enum Sizee{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	public int getSize() {
		
		switch (this) {
		case SMALL:
			return 1;
		case MEDIUM:
			return 2;
		case LARGE:
			return 3;
		case EXTRALARGE:
			return 4;
		default:
				return 0;
			
		}
	}
}


public class Day29c {

	public static void main(String[] args) {
		
		int order = Sizee.SMALL.getSize();
		System.out.println(order);

	}
	
	//Sizee.SMALL ===========>object of small size ======> this
	//Sizee.MEDIUM ==========> object of medium size=====> this

}
