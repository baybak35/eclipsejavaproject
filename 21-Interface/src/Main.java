
public class Main {

	public static void main(String[] args) {
		
		//DeskPhone mikePhone = new DeskPhone(20202020, true);
		
		ITelephone mikePhone = new DeskPhone(202020,true); //polymorphism
		mikePhone.powerOn();
		mikePhone.callPhone(202020);
		mikePhone.answer();
	}

}
