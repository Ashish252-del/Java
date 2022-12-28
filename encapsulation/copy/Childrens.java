package encapsulation.copy;

public class Childrens {
	private int age; private String name;
	
	public int getAge() { return age; }
	public void setAge(int age) { if (age>20) { System.out.println("You are too old"); }
	else { this.age = age; }
	}

	public static void main(String[] args) {
		
		

	}

}
