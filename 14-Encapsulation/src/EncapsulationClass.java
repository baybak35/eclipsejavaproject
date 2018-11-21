
public class EncapsulationClass {

	public static void main(String[] args) {

		Car porsche = new Car();
		porsche.setModel("911"); //this is how you sent the model
		String model = porsche.getModel();
		System.out.println(porsche.getModel());
	
	}

}
