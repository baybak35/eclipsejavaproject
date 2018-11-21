package List;
import java.util.Vector;

public class VectorListClass {

	public static void main(String[] args) {
		//Vector has initial size capacity 10
		//And the increase capacity by %100 if exeed. 
		//It prety much increases double 10->20->40->80
		Vector <Integer> v = new Vector<Integer>();
		
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		
		v.add(2);
		
		
		
		
		System.out.println(v.capacity()); 
		
		
		
	}

}
