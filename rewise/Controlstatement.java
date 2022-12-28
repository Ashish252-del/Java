package rewise;
import java.util.Scanner;

public class Controlstatement {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
	 int a = sc.nextInt(); int b = sc.nextInt(); 
		 
		 for ( ; ( a<12 &  b <15);)     
		 { System.out.println(" a = "+a  + " b = "+   b); a = a++; b = ++b; // since a = a++ thats why a is not increasing
		 
	if ( b == 13)  System.out.println("bas kro beh");  if (a==20) continue; }
		 if (a%2 != 0) { System.out.println(" 'a' is odd num"); }
		
	
	}
	  
}
