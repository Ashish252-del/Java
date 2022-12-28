package opps.singletons;

public class MainClass {

	public static void main(String[] args) {
		 Appconfig obj1 = Appconfig.getInstance(); // we will get obj , theses are same objects that is equal to obj 
		 Appconfig obj = Appconfig.getInstance();
		 Appconfig obj2 = Appconfig.getInstance();
		 Appconfig obj3 = Appconfig.getInstance();
// Appconfig obj4 = new Appconfig();  // this will show error because Appconfig constructor is private
	}

}
