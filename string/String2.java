package string;

import java.util.Scanner;

public class String2 {    // note we can not give our class name String because String is reserved word in java

	public static void main(java.lang.String[] args) {
		
	String name = "Ashish" ; System.out.println(name); 
      String animals = new String ("The name of Animals");  System.out.println(animals); 
      Scanner sc = new Scanner (System.in); 
      String animal  = sc.nextLine();
      System.out.println(animal); 
      System.out.println(animal.charAt(0));
      System.out.println(animal.length());
      System.out.println(animal.substring(5));
      System.out.println(animal.substring(1,4));
      System.out.println(animal.contains("dog"));
      System.out.println(animal.isEmpty());
      System.out.println(animal.concat(" Moni"));
      System.out.println(animal.toUpperCase());
      System.out.println(name.toCharArray());
	}

}
