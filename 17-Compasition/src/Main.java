
public class Main {

	public static void main(String[] args) {
		
		//We have to create an Object in order to call our Referance point
		Engine e1 = new Engine();
		
		Honda h1 = new Honda("red", 200, e1); //or 	Honda h1 = new Honda("red", 200, new Engine());

		h1.carInfo();
		h1.startHonda();
	}

}
