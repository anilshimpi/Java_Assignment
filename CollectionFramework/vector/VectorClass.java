package CollectionFramework.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector=new Vector<>();
		vector.add("Anil");
		vector.add("Priti");
		vector.add("Advait");
		
		System.out.println("Before sorting: "+vector);
		
		Collections.sort(vector);
		System.out.println("After sorting: ");
		for(String s:vector) {
			System.out.println(s);
		}
	}

}
