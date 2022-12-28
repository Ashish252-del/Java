package heap;
import java.util.*;
public class printPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
 int [] A = new int [n];
   for(int i =0; i<n; i++) A[i] = sc.nextInt();
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Queue<Integer> odd
    = new LinkedList<>();
    Queue<Integer> even
    = new LinkedList<>();
    for(int i =0 ; i<n; i++) {
    	if(A[i]%2==0) even.add(A[i]);
    	else odd.add(A[i]);
    }
    if(even.isEmpty()||odd.isEmpty()) {
    	System.out.println(-1);
    	return ;
    }
    pq.add(odd.poll());
    while(!odd.isEmpty()) {
    	int curr = odd.poll();
        if(pq.peek()>curr) {pq.poll(); pq.add(curr);}
        else pq.add(curr);
    }
    while(!even.isEmpty()) {
    	int curr = even.poll();
        if(pq.peek()>curr) {pq.poll(); pq.add(curr);}
        else pq.add(curr);
    }
    while(!pq.isEmpty()) System.out.print(pq.poll()+" ");
	}

}
