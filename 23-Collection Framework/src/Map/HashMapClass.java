package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
	
	//HashMap - fast, unsync, work with single thread, allows one null key
	//HashTable - slow,sync, works with multiple thread, does not allow null key
	//LinkedHashMao - preserver the insertion order

	public static void main(String[] args) {
		
		//Map map = new HashMap();
		Map<String,String> map = new HashMap<>(); 
		//specify the data type
		//key-and value. that means my input is String output Is String too
		
		map.put("myName", "Mike");
		map.put("myJob","Developer");
		map.put("myAge", "25");
		map.put("x","y");
		
		System.out.println(map);
		System.out.println(map.get("myName"));
		System.out.println(map.get("myName2"));
		
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key + " " );
		}

		
		
		
	}

}
   