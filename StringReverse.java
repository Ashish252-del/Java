import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int a1 [] = new int [n];
			int b1 [] = new int [n];
			
			for(int i = 0; i<n; i++)
				a1[i] = sc.nextInt();
			for(int i = 0; i<n; i++)
				b1[i] = sc.nextInt();
			Arrays.sort(a1); Arrays.sort(b1);
			if(n==1) {
				if (a1[0]>b1[0]) System.out.println("YES");
				else System.out.println("NO");
				
			}
			if(n>1) {int test = a1[n-1] - b1[n-1]; boolean c = false;
			for(int i = 0; i<n-1; i++) {
			if (a1[i]-test == b1[i] || b1[i]==0) c = true;
			else c = false;
			} if(c) System.out.println("YES");
			else System.out.println("NO");}
			t--;
				
		}
    
	} 
	}      
                   
                                                        
                                  
                                               
    