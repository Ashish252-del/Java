package mycaption;

public class JavaMycaption2 {
	public static void main(String[] args) {
		
		String s1 = "Welcome to Javatpoint";  
     int [] al = new int[256];
        System.out.println("Char Array length: " + (int) s1.length());  
        System.out.println("Char Array elements: ");  
      for (char c: s1.toCharArray() ) {System.out.println(c); int index = (int) c; System.out.println(index); }
		

}
}