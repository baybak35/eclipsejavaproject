package computer;

public class Case {
	//1st write properties, 2nd create constructor, 3rd create getters(maybe setters)

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions; //"has a" relationship
	
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimentions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimentions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}
	
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimentions() {
		return dimensions;
	}
	
	
	
	
	
}
