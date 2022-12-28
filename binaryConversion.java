import java.util.Scanner;

public class binaryConversion {

	public static void main(String[] args) { int k = 0;
		 
		Scanner sc = new Scanner(System.in); int n = sc.nextInt();  int i =0; int p =n;
		while (n>0) { n = n/2; k++; }  int arr [] = new int[k];
		
		while (p>0) { arr [i] = p%2; p = p/2; i++; } 
		for (int j = 0; j<arr.length; j++){ System.out.println(arr[k-j-1]); } 

	}

}
