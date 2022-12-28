package geeksforgeeks;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		int year = sc.nextInt();  if (year%4==0&&year%100!=0) {System.out.println("Leap year"); }
		else if (year %400==0){ System.out.println(" Non leap year"); }
		else { System.out.println("Not leap year"); }
		// Calculator
		System.out.println("Select an operation\n"+"1.Addition\n"+"2.Substraction\n"+"3.Multiplication"); int x = sc.nextInt();
	   if (x !=1&& x!=2 && x!=3) { System.out.println("You have entered invalid number"); }
	   else {	System.out.println("Enter first number:"); double a = sc.nextDouble();
		System.out.println("Enter second number:"); double b = sc.nextDouble();
		switch (x) { case 1: System.out.println("Result is "+ (a+b)); break;
		             case 2: System.out.println("Result is "+ (a-b)); break;
		             case 3: System.out.println("Result is "+ (a*b)); break;} }
	   
		
	}

}
