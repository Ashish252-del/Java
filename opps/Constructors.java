package opps;
 class Vehicle { int wheels, Headlight; 
  Vehicle(int noofwheel) { wheels = noofwheel; Headlight = 2; } 
 }
class mmmut { int branch; } // here we have not defined constructor hence default constructor 
public class Constructors { 
	Constructors() { System.out.println("Hey"); }
	public static Constructors obj = new Constructors(); // calling of Constructors for print Hey outside main function for this static keyword is used
	public static void main(String[] args) { 
		
		 Vehicle car = new Vehicle (4); // calling inside main
		 mmmut Ece = new mmmut (); System.out.println( car.wheels + " " + car.Headlight  + "   \n" + Ece.branch);         
		
	}

}
 
