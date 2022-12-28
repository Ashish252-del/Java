import java.util.Scanner;

class A {
    int c = 1;
    long power(int n, int p) throws Exception {
        if (n<=0||p<=0) throw new Exception ( "n or p should not be negative") ;
        else if(n==0&&p==0)throw new Exception ( "n and p should not be zero"); 
        else for (int i =0; i<p; i++){c=c*n;}return c;}
    
}

public class Power {
    public static final A my_calculator = new A();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}