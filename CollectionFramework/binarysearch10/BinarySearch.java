package CollectionFramework.binarysearch10;

public class BinarySearch {

	public static Search insert(Search var1, int data)
	 {
	 if (var1 == null)
	 return new Search(data);
	 if (data < var1.data)
	 var1.backward = insert(var1.backward, data);
	 if (data > var1.data)
	 var1.forward = insert(var1.forward, data);
	 return var1;
	 }
	 
	 // InOrder function to display value of array
	 // in sorted order
	 public static void inOrder(Search var1)
	 {
	 if (var1 == null)
	 return;
	 inOrder(var1.backward);
	 System.out.print(var1.data+" ");
	 inOrder(var1.forward);
	 }

}
