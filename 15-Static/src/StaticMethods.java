
public class StaticMethods {

	public static void main(String[] args) {
		
		Abc x = new Abc(); 
		x.show2();
		//Here I have to create an Object first in order to create show2()
		
		Abc.show1(); 
		//I can call this like this because Abc is belongs to StaticMethods. No need creating Object		
	}
}
class Abc{
	public static void show1() { 	//static method
		System.out.println("hi");
		//Show2(); //throws an error. You cannot run Instance method from a Static method
		show4(); //this is fine
	}
	
	public void show2() { 	//Instance method
		System.out.println("hi");
		show1(); //but this is fine
	}
	
	public void show3() { 	//Instance method
		System.out.println("hi");
	}
	
	public static void show4() {	//static method
		System.out.println("hi");
	}
	
	
}
