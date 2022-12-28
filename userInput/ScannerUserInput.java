package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {            
		
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        System.out.println(x);
        
        double myname = sc.nextDouble();
        System.out.println(myname);
        
        int principal = 200;
        float rate = (float)12.5;
        byte time = 5;
        double simpleInterest = principal*rate*time/100;
        
        System.out.println("the simple interest is"+simpleInterest);
        
        float mass = 2.5f;
        float acceleration = 9.8f;
        double force = mass*acceleration;
        System.out.println("Applied force is "+force);
        
        
        
		
	}

}
