import java.util.*;
public class Boxproblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
	  while (n>0) { 
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = sc.nextInt();
		    if (A+B+C<=D) {System.out.println(1);}
		    else  if (A+B<=D||B+C<=D||C+D<=D) {System.out.println("2");}
		    else if (A+B>=D) { int sum = A+B;    float y = (float)sum/(float)D;      
		    if (y>(float)(sum/D)) { System.out.println((int)y+2);}
		    else  {System.out.println((int)y+1); } }
		    else  if (A+C>=D) { int sum = A+C;    float y = (float)sum/(float)D;      
		    if (y>(float)(sum/D)) { System.out.println((int)y+2);}
		    else  {System.out.println((int)y+1); } }
		    else  if (C+B>=D) { int sum = A+B;    float y = (float)sum/(float)D;      
		      if (y>(float)(sum/D)) { System.out.println((int)y+2);}
		    else  {System.out.println((int)y+1); } }
		    else  if (A+B+C>=D) { int sum = A+B+C;    float y = (float)sum/(float)D;      
		    if (y>(float)(sum/D)) { System.out.println((int)y+1);}
		    else  {System.out.println((int)y); } }
		    
	n--;	}

	}

}
