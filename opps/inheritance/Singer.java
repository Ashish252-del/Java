package opps.inheritance;

public class Singer extends Person {  // extends keyword will make Singer to a child class of Person

	Singer(int age) {
		super(age); // super(name) will call constructor of Parent but u have to make a constructor here also 
		System.out.println("You are in Singer constructor");
	}
  public void sing () { System.out.println(name + " is singing "); } 
  
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
