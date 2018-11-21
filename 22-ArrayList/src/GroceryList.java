import java.util.*;

public class GroceryList {
	
	//.add(), .size(), .set(), .get(), .contains(), .indexof()
	
	//2 different ways to declare objs
	
	//List groceryList = new ArrayList();  //this Obj can hold ANY Data Type
	List<String> groceryList = new ArrayList<String>(); //But if you just want String use this one 
	//List<Integer> groceryList2 = new ArrayList<Integer>(); //this one just holds int
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println( (i+1) + "." + groceryList.get(i) );
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
	}
	
	public void removeGroceryItem(int position) {
		groceryList.remove(position);
	}
	
	public String findItem(String searchItem) {
		//1way 
		//boolean exists = groceryList.contains(searchItem);
		//2way
		int position = groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
		
	}
	
	
}
