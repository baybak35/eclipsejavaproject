
public abstract class Animal {
	
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void eat(); //this throws an error because Animal has to be abstract too
	public abstract void breathe(); //no body, 

	public String getName() {
		return name;
	}
	
	
	
	
}
