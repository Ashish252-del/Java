package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

	       Scanner sc = new Scanner (System.in);
	       int n = sc.nextInt();
	        int [] a = new int [n];
	       
	   for (int i = 0; i <n; i++) {
	       a [i] = sc.nextInt();
	   }
	   for (int j = 0; j<n; j++) {
	       if(j<n-1-j) { int temp = a[j]; 
	       a[j] = a[n-1-j];  a[n-1-j] = temp; } 
	       System.out.print(a[j]+" ");
	   }
	   

	}

}
