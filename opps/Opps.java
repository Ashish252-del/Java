package opps;

 class Cat { boolean hasfur; int legs, eyes;
  public void walk () { System.out.println(" Cat is walking"); } // Instance mathod
  public void eat () {System.out.println("Cat is eating"); }
  public void description() { System.out.println("my cat has "+ legs+ " legs and " +eyes+ " eyes"); }
  }
  
 
 public class Opps {
	public static void dance () { System.out.println(" Cat is dancing"); } // Static mathod no need to make object

	public static void main(String[] args) {
		 dance();
		 Cat cat1 = new Cat(); Cat cat2 = new Cat(); 
		 cat1.walk(); cat2.eat(); cat1.legs = 4; cat2.eyes=1;  cat1.description(); cat2.description();

	}

}
