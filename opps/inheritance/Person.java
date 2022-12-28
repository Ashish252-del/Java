package opps.inheritance;

public class Person {
	protected String name; protected int age;
	public void walk () { System.out.println(name + " is not walking"); }
	public void eat () { System.out.println(name + " is eating"); }
	Person (int age) { this.age = age;  System.out.println("You are in Person constructor"); }
	

	public static void main(String[] args) { Person p = new Person (5);
		// TODO Auto-generated method stub

	}

}
