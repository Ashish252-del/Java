package heap;

import java.util.*;

public class printSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
      int n = sc.nextInt(), k = sc.nextInt();
      int [] A = new int [n];
      for(int i =0; i<n; i++) A[i] = sc.nextInt();
      HashMap <Integer, Integer> h = new HashMap<>();
      int c1 = 0, c2 = 0;
      for(int i =0; i<n ; i++) {
    	  if(h.containsKey(A[i])) { h.put(A[i], h.get(A[i])+1); c1++; }
    	  else  {h.put(A[i], 1); c2++;}
      }
     
    PriorityQueue <Integer> pq = new PriorityQueue<>();
    
    if((c2 - c1)>=k) {
    for(Map.Entry<Integer,Integer> e : h.entrySet()) {
    	if(e.getValue()==1 ) pq.add(e.getKey());
    	
    }
   while(k-->0) System.out.print(pq.poll()+ " ");
    }
    else System.out.println(0);
	}

}
