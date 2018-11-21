
public class Dog2 {
	public String name;
	public int age;
	public String breed;
	public String color;
	public static String university = "Cybertek"; 
	//when you use static that property belongs to every object
	//in the future you static browser Chrome, then all the test cases run o Chrome 
	
	
	public Dog2() {		//THIS IS CALLED CONTRUCTOR. THIS IS A CONSTRUCTOR FOR THE CLASS NAMED DOG2
		//System.out.println("default constructor");
		this("x",7,"y","s"); //this will call Dog2 with PARAMETERS
		name = "Mike";
		age = 49;
		breed = "Poodle";
		color = "Brown";
	}
	
	public Dog2(String name, int age, String breed, String color) {		//THIS IS CALLED CONTRUCTOR. THIS IS A CONSTRUCTOR FOR THE CLASS NAMED DOG2
		//System.out.println("default constructor");
		//this(); //this code looks for another CONTRUCTOR with NO PARAMETER and runs it.
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.color = color;
	}
	
	

	
	public void bark() { //these are methods
		System.out.println(name + " is barking.");
	}
	public void eat() {		//these are methods
		System.out.println(name + " is eating");
	}
	public void wagTail() {		//these are methods
		System.out.println(name + " is wagging tail");
	}
}
