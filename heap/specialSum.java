package heap;
import java.util.*;
public class specialSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	sc.nextLine();
	String str = sc.nextLine();
	PriorityQueue <Integer> pq = new PriorityQueue<>();
	for(int i=0; i<n; i++) {
		if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')&&pq.size()>0) pq.poll();
		pq.add((int)str.charAt(i));
	}
	int ans =0;
	while(!pq.isEmpty()) ans = ans+pq.poll();
	System.out.println(ans);
	}

}
