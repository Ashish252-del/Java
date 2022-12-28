package rewise;

public class Method {  int c=10; static void swap (int a, int b) { int temp = a; a = b; b = temp; }

	public static void main(String[] args) {
		int x = 10; int y = 12; Method obj = new Method(); obj.c=5;
		 swap (x,y); System.out.println(x+ " " + y );// since pass by value
	}

}
