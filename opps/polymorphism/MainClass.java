package opps.polymorphism;

public class MainClass {

	public static void greeting () { System.out.println("Hi, there"); }
	public static void greeting (String s) { System.out.println(s); }
	public static void main(String[] args) {
		// run time Polymorphism 
		
		Dog d = new Dog (); Pet p = d; // (Upcasting) run time polymorphism during run time i8t will see that p is also  of Dog or object of Dog 
		d.walk(); p.walk(); 
		System.out.println( d.name + "  "+  p.name); // Variable does not override 
		
        // compile time polymorphism
		greeting (); greeting("Good morning");
		
		
		
		
	}

}
