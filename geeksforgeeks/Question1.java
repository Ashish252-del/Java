package geeksforgeeks;
import java.util.Scanner;
class Ap { int a,b,d,n;  
  static int nthTerm(int a, int d, int n) {   int x = a+((n-1)*d); 
                                               return x; }}
public class Question1 {

	public static void main(String[] args) { 
		Ap obj = new Ap (); System.out.println(obj.nthTerm(2, 3, 4));
       // even and odd num
		Scanner sc = new Scanner(System.in); int a = sc.nextInt(); 
		if (a%2==0) { System.out.println("even");}
		else  { System.out.println("odd"); }
		if (a<0) { System.out.println("You have entered negative number"); return;} 
		System.out.println("Sum of "+a+" natural numbers is "+ (a*(a+1))/2);
	
	}

}
