package geeksforgeeks;

public class WrapperClasses {

	public static void main(String[] args) {
		int x1 = 10; 
		Integer x2 = new Integer(20); System.out.println(" x1 =" +x1 + " \n x2 = "+x2);
		Character p = new Character ('A'); System.out.println(p);
		
		// Auto boxing and Un boxing 
		
		int a = x2; // auto un boxing
		x2 = x1; // auto boxing 
		Integer y = x1; // auto boxing
		System.out.println(a+" "+" "+y+" "+ x1);
		Integer x3 = 400; Integer x4 = 400; // x3 and x4 are object type variable
		if (x3==x4) System.out.println("same");
		else System.out.println("not same"); // not same becasus both are references
		
		
		
		
	}

}
