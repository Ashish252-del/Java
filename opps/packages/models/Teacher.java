package opps.packages.models;
 import opps.packages.*;
public class Teacher {

public static void main (String[] args) {
	
	 Student sec = new Student("Ashish"); System.out.println(sec.name);  System.out.println(sec.Add);
//	 sec.password / will show compile time error because password is private field
	 
	 System.out.println(sec.getName());
     }
  }