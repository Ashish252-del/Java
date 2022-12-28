package heap;
import java.util.*;
public class specialPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int A [] = new int [n]; int B [] = new int [n];
      for(int i =0; i<n; i++) A[i] = sc.nextInt();
      for(int i =0; i<n; i++) B[i] = sc.nextInt();
      PriorityQueue <Integer> ans = new PriorityQueue<>();
      ans.add(Math.max(A[0],B[0]));
      for(int i =0; i<n; i++) {
    	 int curr = Math.min(A[i], B[i]);
    	 if(curr>ans.peek()) ans.add(curr);
      }
      while(!ans.isEmpty()) System.out.print(ans.poll()+" ");
	}

}
