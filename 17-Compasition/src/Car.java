// Basically there is no relationship between Car and Engine. Everything meets on Honda
public class Car {
	
	private String color;
	private int maxSpeed;
	
	public void carInfo() {
		System.out.println("car color: " + color + " ,Car maxspeed: " + maxSpeed);
	}
	
	public Car(String color, int maxSpeed) {
		super();
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}


	

}
