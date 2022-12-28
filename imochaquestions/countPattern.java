package imochaquestions;

import java.util.Scanner;

public class countPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		for(int i =0; i<n; i++) arr[i] = sc.nextInt();
	
 int curr  = 0, cnt =0;
 if(arr[0]%2==0) curr++;
 for(int i =1; i<n; i++) {
	 
	 if(((arr[i]%2!=0)&&(arr[i-1]%2!=0))||((arr[i]%2==0)&&(arr[i-1]%2==0))) {if(curr>1) cnt++;
	 curr=0;
	 if(arr[i]%2==0) curr++;}
	 else curr++;
 }
 if(curr>1) cnt++;
 System.out.println(cnt);
	}

}
