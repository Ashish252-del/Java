package imochaquestions;
import java.io.*;
import java.util.*;
public class countPaper {
     
	static void findPaperRequired(int N, int [] A) {
int a=0, b=0 ,c=0;
		
		for(int i =0; i<N; i++ ) {
			if(A[i]%2==0) {
				if(((A[i])&(A[i]-1))==0) a++;
				else b++;
			}
			else c++;
		}
		 System.out.println(a+" "+b+" "+c);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A [] = new int[N];
		for(int i =0; i<N; i++) 
			A[i] = sc.nextInt();
		findPaperRequired(N,A);
	}

}
