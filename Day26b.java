package gitshare;


//We cannot inherit multiple parent classes

class A{
	public void GreetA() {
		System.out.println("Hi");
	}
}

class B {
	public void GreetB() {
		System.out.println("Bye");
	}
}

//Only one class can be inherited in the child class

class C extends A{
	
	
}

//class C extends A,B-----------We cannot inherit multiple classes


public class Day26b {

	public static void main(String[] args) {
		C Mango = new C();
		Mango.GreetA();
		
		
		
		
	}
		

	}


