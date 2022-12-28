package staticKeyword;

// class A {
//	  class B { 
//		  static class c { // here it will show compile error because you are declaring a static class in a non static parent 
//	  }                  // you can declare  non static only in static parent or top level parent here if you will declare inside A then you will get no error 
// } }
//  


public class Person { int age; static String  name;
 
 void output() { System.out.println(" Name of person\n " + name + " \n" + " age "+ age); }

	public static void main(String[] args) {
		 Person Student = new Person(); Student.name = "Ashish"; Student.age = 14; 
		 
		 Person Children = new Person(); Children.age = 5; Children.name = "Manish";  Student.output(); // since age is static so its value will not change 
     A objA  = new A(); A.B  objB = objA.new B(); // here we have called non static class B with the help of object of outer class A
    A.C objC = new A.C();    // here no need of object of outer class because it is static class
	}

}
