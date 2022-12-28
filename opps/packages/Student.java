package opps.packages;

public class Student { 
	public String name; private String password; public String Add;
	public Student (String name) { this.name = name;  } // constructor
	
  public static String getName () { return "jkgjhg";  } // method
  public String getPassword () { return password; }       // method
	public static void main(String[] args) { Student obj = new Student ("Ashish"); System.out.println(obj.name);
		obj.name = "jerry";  System.out.println(obj.name);
      System.out.println(getName()); 
	}



	}


//     class Ashita { int a; int b; 
//     
//     obj.password = "jerry";  } // here it is showing compile time error because name is private field we can not access it in different class