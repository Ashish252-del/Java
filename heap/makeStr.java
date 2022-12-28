package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class makeStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		String b = sc.nextLine();
		PriorityQueue<Character> min = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Character> max = new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			min.add(a.charAt(i));
			max.add(b.charAt(i));
		}
		for(int i =k; i<n; i++) {
			char c1 = a.charAt(i);
			char c2 = b.charAt(i);
			if(min.peek()>c1) {min.poll(); min.add(c1);}
			if(max.peek()<c2) {max.poll(); max.add(c2);}
		}
       String ans = "";
       while(!min.isEmpty()) ans = ans + min.poll();
       while(!max.isEmpty()) ans = ans+ max.poll();
       System.out.println(ans);
	}

}
