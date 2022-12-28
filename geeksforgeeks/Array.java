package geeksforgeeks;
import java.lang.Math;
import java.util.Scanner;

public class Array { 
	 public static void Distinct(int[]arr,int n) { int x = 0;for ( int i = 0; i<arr.length;i++) { boolean isDistinct = true;
	                                               for (int j = 1;i+j<arr.length; j++) {  if (arr[i]==arr[i+j]) { isDistinct = false; break; } }
	                                               if (isDistinct) {  x = x +1;} } System.out.println(x); }
	public static void main(String[] args) {
		// Maximum of array
		Scanner sc = new Scanner (System.in); System.out.println("Enter length"); int n = sc.nextInt();
		System.out.println("Enter Values"); int a [] = new int[n];   
		for ( int i = 0; i<n; i++) { a[i] = sc.nextInt(); }  int x = a[0]; 
		for (int i = 0; i < n-1; i++) { x = Math.max(x,a[i+1]);   } 
	        System.out.println("max is "+ x); Distinct(a,n);

	}

}
