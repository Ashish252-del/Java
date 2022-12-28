package geeksforgeeks;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); int n = sc.nextInt(); 
		for (int i = 1; i<=n; i++) { for (int j = 0; j<n; j++) { System.out.print("*"); }System.out.println("");}
	for (int i = 1; i<=n; i++) { for (int j = 1; j<=n; j++) { System.out.print(j); }System.out.println("");}
		int x = sc.nextInt();  int i = 1; while(i<=x) { int j = 1; while (j<=(x-i)) { System.out.print(" ");j++;}
		                                               int k = 1;    while (k<=(2*i-1)) {System.out.print("*");k++;} i++;
                                                          System.out.println("");		}
		
	}

}
