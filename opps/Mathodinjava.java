package opps;

import java.util.Scanner;

public class Mathodinjava {
	// Creating a method for comparing two numbers
	static void sayHii() {System.out.println("hiii");}
	static int maxof(int a, int b) 
	{ if (a>b) {return a;}
	else { return b; }
	}
	
	static void swap(int x, int y) {  int temp = x; x = y; y = temp; System.out.println(x + " " + y); } 
	public static void main(String[] args) {
	// calling of method
		sayHii(); int firstnum = 1 , secondnum = 0;
	int result = 	maxof(firstnum, secondnum); System.out.println(maxof(10,20));
	System.out.println(result);
	
  swap(10,12); swap(5,6); 
	}

}
