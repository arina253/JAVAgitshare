package gitshare;

enum Size{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Order{
	
	Size pizzaSize;
	
	public Order (Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	public void orderConfirmation() {
		
		switch (pizzaSize) {
		case SMALL:
			System.out.println("you ordered a small size pizza");
			break;
			
		case MEDIUM:
			System.out.println("you ordered a medium size pizza");
			break;
			
		case LARGE:
			System.out.println("you ordered a large size pizza");
			break;
			
		case EXTRALARGE:
			System.out.println("you ordered a extralarge size pizza");
			break;
		}
	}
}
		

public class Day29b {

	public static void main(String[] args) {
		
		
		Order order = new Order (Size.SMALL);
	
		order.orderConfirmation();
		
		
	}

}
