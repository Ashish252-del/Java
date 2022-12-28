package opps.singletons;

public class Appconfig {
	
 private Appconfig() { System.out.println("Welcome");  } // private constructor, you can't make object of it out of class
 

  public static Appconfig getInstance() { return obj; } // since obj is object of Appconfig that is why at the place of return type Appconfig is used ijn this method
  
	public static void main(String[] args) {
		System.out.println("Ashish");
		Appconfig obj9 = new Appconfig(); // 
		
	}
	  private static Appconfig obj = new Appconfig(); // object is private you can't acces it out of class
}
