import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i =0; i<T; i++){
		    int N = sc.nextInt(); int D = sc.nextInt();
		    int [] a = new int[N];  int [] b = new int[N];
		 for (int j =0; j<N; j++)
		    a[j] = sc.nextInt();
		     for (int k =0; k<N; k++){
		     if(D+k<N) b[k] = a[D+k]; if (((N-D)+k)<N) b[(N-D)+k] = a[k];
		     }
		   for (int l =0; l<N; l++) System.out.print(b[l]+" "); 
		}System.out.println("");
	}

}
