
public class Dog extends Animal {

	public Dog(String name) { //when u create a concrete class, u have to override 
		super(name);
	}

	@Override
	public void eat() { //no body methods need to be overridden 
		System.out.println(getName() + " is eating.");
	}

	@Override
	public void breathe() {
		System.out.println(getName() + " is breathing.");

	}
	
	
	
}
