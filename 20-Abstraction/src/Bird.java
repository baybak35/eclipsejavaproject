
public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//animal is an abstract class, you have to override it

	@Override
	public void eat() {
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breathe() {
		System.out.println(getName() + " is breathing");

		
	}
	public abstract void fly();
	
	
	
}
