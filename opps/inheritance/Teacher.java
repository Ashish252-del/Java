package opps.inheritance;

public class Teacher extends Person {
	Teacher(int age) { // if you have made constructor in parent then you will have to make constructor in child other wise it will show compilation error
		super(age);
		System.out.println("You are in teacher constructor and the age of tracher is "+ age);
	}

	public void teach () { System.out.println(name + " is teaching"); }
    public void eat () { super.eat(); System.out.println(name + " will  eat paneer today"); } // this is overhiding of Parent and super keyword will call parent method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
