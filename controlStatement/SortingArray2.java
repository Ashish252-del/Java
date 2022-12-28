package controlStatement;

import java.util.Scanner;

public class SortingArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the lenght of Array");
		int n =sc.nextInt();  int [] num = new int[n]; 
		System.out.println("Enter the elements of Array");
	
  for (int i = 0; i<n; i++ ) { num [i] = sc.nextInt(); }
  
   for(int i = 0; i < n-1; i++  ) 
   { boolean Sorted = true;
	   for (int j=0; j< n-1-i; j++) 
   { if (num [j]>num[j+1]) { int A = num[j+1]; num [j+1] = num[j]; num [j] = A;  Sorted = false; }// end of if statement
   } if (Sorted) break; // end of j loop
   } // end of i loop 
		
		// We are using for each loop for printing the Array
   System.out.println(" Sorted Array");
   for (int x : num) {System.out.print(x + " "); }
		
		
		
		
		
}
}