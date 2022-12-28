package controlStatement;
 import java.util.Scanner;
public class WhilLeoop {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner (System.in);
		int i=1;
		 while(i<10)
		 {
		 System.out.println(i);
	  i = ++i;  
		 }
		 System.out.println(" Table of two");
		int n = sc.nextInt();
		  while (n<=10)
		  { System.out.println( (2*n)); n = ++n; }
		 
		 
	}

}
