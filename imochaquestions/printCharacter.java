package imochaquestions;

import java.util.Scanner;

public class printCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int x = sc.nextInt();
		int l = 0, h = str.length()-1;
		boolean check = true;
		while(h>=l) {
			int mid = (l+h)/2;
			int a = str.charAt(mid);
			if(a==x) {System.out.println((char)a);
			check = false; break;}
			if(a<x) l=mid+1;
			else h = mid-1;
		}
       if(check) System.out.println(0);
	}

}
