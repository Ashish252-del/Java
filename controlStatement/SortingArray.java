package controlStatement;

public class SortingArray {

	public static void main(String[] args) {
	
		int [] num = {2,5,1,9}; {System.out.println("Given num are "); 
		for (int i= 0; i<4; i++ ) System.out.print(num [i] + " "); }
		
	
		for (int i = 0; i<3; i++)  
		{ for (int j=0; j<3-i; j++)
		{ if ( num[j] > num[j+1])
		{ int A = num [j+1]; num[j+1] = num [j]; num [j] = A; } // end of if statement
		} //  end of j loop
		} // end of i loop 
		
		System.out.println("\nSorted Array"); for (int x : num) {System.out.print( x +" " ); }  
		
    
		
	}
	

}
