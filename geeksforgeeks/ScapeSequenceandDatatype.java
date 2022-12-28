package geeksforgeeks;
import java.math.BigInteger;
public class ScapeSequenceandDatatype {

	public static void main(String[] args) {
		System.out.println("C:\\ xyz\\abc.txt");
		BigInteger a = new BigInteger ("2");
		int n = 4;
		for ( int i = 2; i<= n; i++) {
			a = a.multiply(a.valueOf(i));
		} int x = 30; int y = x ; y = 10; System.out.println(x+" "+y);// primitive will allocate memory 
     System.out.println("Values of 4! = "+a);
     // non primitive are always references
     point p1 = new point (); p1.x=20;  point p2 = p1; p2.x = 10; System.out.println("p1.x = "+p1.x+ "\np2.x = "+p2.x);
     point p3 = new point (); p1 = p3; p3.x =50; System.out.println("p1.x = "+p1.x+ "\np2.x = "+p2.x+"\np3.x = "+p3.x+ "\n p1.y = "+p1.y); }
 
}
class point { int x ; int y; } 