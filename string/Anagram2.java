package string;

import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		String x = sc.nextLine(); String y = sc.nextLine();
		String z = y.toLowerCase(); String w = y.toUpperCase();
		boolean isAnagram = false; boolean visited [] = new boolean [x.length()];
		if (x.length() == y.length()) {
			for (int i = 0; i <x.length(); i++) {
				char a = x.charAt(i); isAnagram = false;
				for ( int j = 0; j<x.length(); j++) {
					if (((a==y.charAt(j))|| (a==z.charAt(j))|| (a==w.charAt(j)))&&!visited[j]) { isAnagram = true;  visited[j] = true ; break;}
													}
				if (!isAnagram) { break; }
	}
		}
  if (isAnagram) { System.out.println("Anagrams"); }
  else { System.out.println("Not Anagrams");}
	 }}
