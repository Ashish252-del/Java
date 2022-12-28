package staticKeyword;

public class A {
	static { System.out.println(" i will run firstly"); }
   class B {  }     // nested class
	   static class C {    // nested class
   
   } 
    
	public static void main(String[] args) {
		//go in person class we will call these classe4s there 
   System.out.println(" incide main");
	}
 static { System.out.println("Static block wala hun"); } // Static blocks can use only inside classes not in main
}
