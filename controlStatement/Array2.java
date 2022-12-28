package controlStatement;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the order of matrix A");
		int m =sc.nextInt(); int n =sc.nextInt(); 
		
		int A [][] = new int [m][n]; 
    System.out.println("Enter the elements of matrix A");
      for (int i=0; i<m; i++) { 
    	
         for (int j=0; j<n; j++) 
    	  
         { A [i][j] = sc.nextInt(); } }
      System.out.println("Enter the order of matrix B");
      int p =sc.nextInt(); int q =sc.nextInt();
      int B [][] = new int [p][q];
      System.out.println("Enter the elements of matrix B");
      for (int i=0; i<p; i++) { 
      	
          for (int j=0; j<q; j++) 
     	  
          { B [i][j] = sc.nextInt(); } }
      int C[][] = new int [m][q];
      if (n==p) { System.out.println("Rusltant Matrix"); int sum =0; 
               
                for (int i=0; i<m; i++) { 
                  	
                    for (int j=0; j<q; j++) { for (int k=0; j<q; k++)
                    {    sum = sum + A[i][k]*B[k][j] ; } // end of k loop 
                    C[i][j] = sum; sum = 0;
                    System.out.print(C[i][j]+" ");  //printing matrix element  
                    }//end of j loop  
                    System.out.println();//new line    
                                       } 
                
                }
      
      else { System.out.println("We can not multiply"); }
     
      
      
      

	} 
	
}
