package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SquareSun {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr [] = new int [n];
		for(int i =0; i<n; i++) arr[i] = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) pq.add(arr[i]);
		while(k-->0) {int t = pq.poll();
		if (t==0) break;
		t--; pq.add(t);}
		int sum = 0;
		while(!pq.isEmpty()) {
			int curr = pq.poll();
			sum = sum + curr*curr;
		}
 System.out.println(sum);
	}

}
