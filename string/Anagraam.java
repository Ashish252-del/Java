package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagraam {
	public static void main(java.lang.String[] args) { 
		Scanner sc = new Scanner ( System.in); 
		String x = sc.nextLine();
		String Y = sc.nextLine();
		int xl[] = new int [256];
		int yl[] = new int [256];
	boolean	isAnagram = true ;
	for (char c : x.toCharArray()) {
		int index = (int) c;
		xl[index]++ ; }
 for (char c : Y.toCharArray()) { 
		int index = (int) c;
		yl[index]++ ; }
 if (Arrays.equals(xl, yl)) {System.out.println("Anagrams"); }
 else { System.out.println("Not Anagrams"); }
 
 
 
 
		
		
	}
}
  