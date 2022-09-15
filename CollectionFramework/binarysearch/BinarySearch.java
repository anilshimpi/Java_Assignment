package CollectionFramework.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(10);
		list.add(20);
		list.add(30);
		
		Collections.sort(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to search");
		int n=sc.nextInt();
		
		int index=Collections.binarySearch(list, n,Collections.reverseOrder());
		System.out.println("Found at index: "+index);
		
	}

}
