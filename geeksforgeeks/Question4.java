package geeksforgeeks;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); System.out.println("Factorial"); int a = sc.nextInt(); int x = 1; 
		int i = 1; while(i<=a) {  x= x*i; i++; } System.out.println(x);
		// Greatest common division of two num
		System.out.println("HCF");
		int c = sc.nextInt(); int b = sc.nextInt(); 
	int j = c; 	while ((b%j!=0&c%j!=0)||(b%j==0&c%j!=0)||(b%j!=0&c%j==0)) { j--; } System.out.println(j);
	 // Lowest common factor
	    System.out.println("LCM"); int x1 = sc.nextInt(); int x2 = sc.nextInt(); int x3= Math.max(x1, x2);
	    for (int k = 1; ;k++) { if (x3%x2==0&&x3%x1==0) { System.out.println(x3); break; } x3=x3+1; }
	  // All devisior of a num 
	    System.out.println("All divisor"); int z = sc.nextInt();
	    for (int k = 1; k<=z; k++ ) { if (z%k==0) System.out.print(k+" "); }  
	    // Check a num prime or not
	    System.out.println("\nPrime or not"); int w = sc.nextInt(); 
	  if (w!=2) {   for (int k = 1; k<w; k++) { if (w%(k)==0) { System.out.println("no"); break; }
	                               else if (k==w-1) { System.out.println("yes"); } } }
	  else System.out.println("yes"); 
	                               
	    
	    
	}

}
