package heap;
import java.util.*;
public class printLargestInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A [] = new int[n];
		for(int i =0; i<n; i++) A[i] = sc.nextInt();
		PriorityQueue<Integer> p1 = new PriorityQueue<>(Collections.reverseOrder()),
				p2 = new PriorityQueue<>(Collections.reverseOrder());
		for(int i =0; i<n; i++) {
			if(A[i]<=5) p1.add(A[i]);
			else p2.add(A[i]);
		}
		int ans =0;
		for(int i =0; i<n; i++) {
			if(A[i]<=5) ans = (ans*10) + p1.poll();
			else ans = (ans*10) + p2.poll();
		}
  System.out.println(ans);
	}

}
