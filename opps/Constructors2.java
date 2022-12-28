package opps;

public class Constructors2 {
	  int wheels; int headlight; String color; 
	  Constructors2(int wheels) { this.wheels= wheels; headlight = 2; }
	  Constructors2(int wheels, String color ) { this.wheels=wheels; this.color=color; headlight = 3; }

	public static void main(String[] args) {
		
		Constructors2 car = new Constructors2(2); Constructors2 tampu = new Constructors2 (3,"black");
		
		System.out.println( car.wheels + " " + car.headlight + " " + car.color + " This was for car \n"  +  tampu.wheels + " " + tampu.headlight + " " + tampu.color  );

	}

}
