package heap;

import java.util.*;
import java.util.Scanner;

public class printNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S [] = new String[n];
		int num [] = new int [n];
		sc.nextLine();
		
		for(int i=0; i<n; i++) S[i] = sc.nextLine();
		for(int i =0; i<n; i++) num[i] = sc.nextInt();
		PriorityQueue<Students> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i =0; i<n; i++) pq.add(new Students(S[i],num[i]));
		for(int i =0; i<3; i++) {
			System.out.println(pq.poll().name);
		}
		
	}

}
  class Students implements Comparable<Students>{
	 String name ; int marks;
	 public Students(String name, int marks) {
		 this.name = name; this.marks = marks;
	 }
	 public int compareTo(Students that) {
		 return this.marks-that.marks;
	 }
 }
