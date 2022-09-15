package CollectionFramework.binarysearch.removeduplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateStringAndSortDesc {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		
		
		System.out.println("Before remove duplicate string: "+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After remove duplicate String: ");
		Set<String> sort1=new LinkedHashSet<>(list);
	
		for(String s:sort1) {
		
		System.out.println(s);	
			
		}
	}

}
