import java.util.Scanner;

public class javaDatatypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
		long a = 1; int p = 1; long x ;
		for (int j =1; j<=62; j++) {  a =  a*2; } 
		for (int j =1; j<=31; j++) {  p =  p*2; } 
		for (int i = 1; i<=t; i++) { 
		try {	 x = sc.nextLong(); 
			
			if (x>= -a*2 && x <= (a*2 - 1)) { System.out.println(x+ " can be fitted in:"); 
			 if ( x>= -128 && x <= 127) { System.out.println("* byte\n"+"* short\n" +"* int\n"+ "* long");}
			 else if (x>=-32768 && x<= 32767)  { System.out.println("* short\n" +"* int\n"+ "* long");}
			 else if (x>= -p && x<=(p-1))  { System.out.println("* int\n"+ "* long");}
			 else { System.out.println( "* long");} } }
			
		catch (Exception e) {System.out.println ( sc.next() + " can't be fitted anywhere." ); } } 
				 
			 System.out.println(Byte.MIN_VALUE);
			
			
			
	} }
	

		
		
		
		
		
		
		
		
	
