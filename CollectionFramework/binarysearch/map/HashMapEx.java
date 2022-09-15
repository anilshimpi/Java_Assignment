package CollectionFramework.binarysearch.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx {
	
	static Map<String,Integer> map=new HashMap<>();
	
	public static void sortedByKey() {
		
		System.out.println("After sorted: ");
		TreeMap<String,Integer> sorted=new TreeMap<>(map);
		for(Map.Entry<String,Integer> entry:sorted.entrySet()) {
			
			System.out.println("Key= "+entry.getKey()+", "+"Value= "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map.put("Pune", 300000);
		map.put("Amravati", 10000);
		map.put("Ghuikhed", 9000);
		
		System.out.println("Before sorting: "+map);
		sortedByKey();
		
		
	}

}
