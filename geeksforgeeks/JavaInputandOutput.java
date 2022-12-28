package geeksforgeeks;
import java.io.*;
import java.lang.Math;
public class JavaInputandOutput {

	public static void main(String[] args) throws IOException {
		//BufferedReader
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a String");
		
		String s = br.readLine();
		System.out.println(s);
		System.out.println("Enter an Integer");
		int x = Integer.parseInt(br.readLine()); 
		System.out.println(x);
		String a = "125"; int y = Integer.parseInt(a); System.out.println((x+a) +"\n"+ (x+y));
         // YOU ALREADY KNOW SCANNER CLASS 
		// JAVA OUTPUT printf method
       
		int p = 100, q = 200; float r = (float)Math.PI;
		System.out.printf("Value of p is %d, and q is %d\n",p,q);
		System.out.println("Value of PI " + r); System.out.printf("Value of PI till two place of decimal is %.2f\n", r);
		
		 System.out.printf("Value of PI  is %5.2f\n", r);  System.out.printf("Value of PI  is %.05.2f\n", r);
		
	}

}
