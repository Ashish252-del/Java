package controlStatement;
 import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	 
		 System.out.println("Enter the num of student"); 
		 int n = sc.nextInt(); 
		 int [] Marks = new int[n];
		 System.out.println("Enter the marks of Stydents "); 
		 for(int i = 0; i<Marks.length; i++)
		 {  Marks[i] = sc.nextInt(); 
		 if (Marks[i]>=90) { System.out.println("Grade A"); }
		 else if (90>Marks[i] & Marks[i]>=80) {System.out.println("Grde B"); }
		 else if (Marks[i]>70) {System.out.println("Grade C");}
		 else { System.out.println("Failed"); }
		
		 }
		
		
		
		
		
		
		
		
	}
	
}
