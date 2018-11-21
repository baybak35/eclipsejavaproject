// Basically there is no relationship between Car and Engine. EVerything meets on Honda
public class Honda extends Car {
	
	private Engine engine; // has a engine, so we put a reference type, like Engine engine
	
	public Honda(String color, int maxSpeed, Engine engine) {
		super(color, maxSpeed);
		this.engine=engine;
	}
	
	public void startHonda() {
		engine.start();
	}

	
	
}
