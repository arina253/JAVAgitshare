

package gitshare;

	/*Write the Java code for the "Shape" interface and the classes implementing it 
	for the "Square" and "Rectangle" shapes.*/

	interface Shape{
		
		
		public void area();
		public void perimeter();
		
		}

	public class Interface {

		public static void main(String[] args) {
			
			Square S = new Square();
			S.area();
			S.perimeter();
			
			
			
			Rectangle R = new Rectangle ();
			R.area();
			R.perimeter();
			
			System.out.println(R.length);
			System.out.println(R.breadth);
			
			
		}

	}

	class Square implements Shape{
		
		int length = 5;
		
		public void area() {
			System.out.println("This is the area of square:" +(length *length) );
		}
		
		public void perimeter() {
			System.out.println("This is the perimeter of square :" +(4*length));
		}

		}

	class Rectangle implements Shape{
		
		int length = 10;
		int breadth = 5;
		

		
		public void area() {
		System.out.println(length * breadth);	
			
		}

		
		public void perimeter() {
			System.out.println(2 * (length + breadth));
			
		}
		
		
	}

