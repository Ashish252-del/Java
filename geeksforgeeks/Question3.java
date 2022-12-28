package geeksforgeeks;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	//	for ( int i =0; i <5; i++) { int x = sc.nextInt(); int y = sc.nextInt(); 
//		                      if (y==0) continue; System.out.println((float)x/y); }
		// Count Numbers
		 int n = sc.nextInt(),i=0;
		while (n>0) {n=n/10; ++i; } System.out.println(i);
		
		
	

}
  }