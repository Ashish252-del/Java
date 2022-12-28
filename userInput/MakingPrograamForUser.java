package userInput;
import java.util.Scanner;

public class MakingPrograamForUser {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int principal = sc.nextInt();
	float rate = sc.nextFloat();
	int time = sc.nextInt();
	double simpleInterest = principal*rate*time/100;
	
	System.out.println("the simple interest is " +simpleInterest);
	
	int capacitance = sc.nextInt();
	int voltage = sc.nextInt();
	int charge = capacitance*voltage;
	
	System.out.println("charge on capacitor " +charge);
	
			
	
	}

}
