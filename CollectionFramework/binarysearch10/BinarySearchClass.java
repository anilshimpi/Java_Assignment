package CollectionFramework.binarysearch10;

public class BinarySearchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = { 1, 2, 3, 2, 5, 4, 4 };
		 
			
		 int n = arr.length;
		 
		 Search a = null;
		 for (int i = 0; i < n; i++)
		 {
		 a = BinarySearch.insert(a,arr[i]);
		 }
		 BinarySearch.inOrder(a);
	}

}
