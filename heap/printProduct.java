package heap;

import java.util.*;
import java.util.Scanner;

public class printProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0; i<n; i++) A[i] = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i =0; i<n; i++) pq.add(A[i]);
		int cnt =0;
		for(int i =0; i<n/2; i++)
		{ int curr = pq.poll();
		if(curr%2==0) cnt++;}
   System.out.println(cnt);
		
	}

}
