package opps.inheritance;

public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher (19); // first call parent constructor then will call child constructor
		t.name = "Ashish"; t.eat(); t.walk(); // this will call child method
		 t.teach(); // t.sing(); will show error because t is object of teacher not of singer
		 
		 // DOWNCASTING
		 Singer S = new Singer (18);
		 Person p = S; // singer is also a person (upcasting)
		 Singer S1 = (Singer) p; // here we have declare that person is Singer because he may be teacher ( downcasting ) 
		 p.walk(); // this will call Parent method because object of Parent is used
		 // for cheaking relations -:
		 System.out.println(S1 instanceof Singer);
		 System.out.println(S instanceof Singer);
		 System.out.println(p instanceof Singer);
		 System.out.println(S1 instanceof Person);
		 System.out.println(S instanceof Person);
		 System.out.println( t instanceof Teacher);
		 System.out.println( p instanceof Teacher);
		 System.out.println( p instanceof Person);
		 
	}

}
