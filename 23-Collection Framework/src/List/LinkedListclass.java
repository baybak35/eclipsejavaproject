package List;
import java.util.LinkedList;

public class LinkedListclass { 	
	//Creates nodes, so when you wanna inser somehting
	//It creates nodes(previous,next), 

	public static void main(String[] args) {
		LinkedList <String> object = new LinkedList<String>();
		
		object.add("A");
		object.add("B");
		//object.addLast("C");
		//object.addFirst("D");
		object.add(1,"C");
		object.add("F");
		//object.add("G");
		System.out.println(object.get(0));
		System.out.println(object.get(1));
		System.out.println(object.get(2));
		
//		object.remove("B");
//		object.remove(3);
//		object.removeFirst();
//		object.removeLast();
//		
//		int size = object.size();
//		System.out.println(object);
	}

}
