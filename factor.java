
public class factor {

	public static void main(String[] args) {
		 int i; int K = 20; int N=9702; int a = 0;
	        for ( i=1; i*i<N; i++)
	        { if (N%i==0){a++; System.out.println(a+" "+i);/* if(a==K) { System.out.println(i); }*/ 
	                     }
	        } System.out.println("stay "+i); if(N/i<=(i-1)) 
	        for( ; i>=1; i--) { if(N/i<=(i-1)) continue; //{a++; System.out.println(a+" "+i);}
	        else if (N%i==0){a++; System.out.println(a+" "+N/i);/* if(a==K) {System.out.println(N/i);  } */
	        }}
	      System.out.println("new way"); K=20;a = 0;
	      for ( i=1; i<=N; i++)
	        { if (N%i==0) {a++; System.out.println(a+" "+i); /*if(a==K) { System.out.println(i); }*/ }}
	}

}
