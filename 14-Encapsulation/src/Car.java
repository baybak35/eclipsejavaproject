
public class Car {
	
	//these are properties
	private int doors;
	private int wheel;
	private String model;
	private String engine;
	private String color;
	
	//all these getters and setter created automatically. Right click,source,generate getter and setters
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model.equals("911")) {
		this.model = model;
		}else {
			this.model = "Invalid";
		}
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}