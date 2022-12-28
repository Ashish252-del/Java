package OperationArray;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) { int cap = 5; int n = 4;
		int arr [] = new int[cap]; Scanner sc = new Scanner(System.in);
		for(int i =0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		for(int i =0; i<cap; i++) System.out.print(arr[i]+" ");
		int pos =3;// we have to insert at 3rd position
		int x = 10; // we have to insert 10
		for (int i =n-1; i>=pos-1; i--) {
			arr[i+1] = arr[i];
		} arr[pos-1] = x; System.out.println("");
		for(int i =0; i<cap; i++) System.out.print(+arr[i]+" ");
	}

}
