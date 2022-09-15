package StringOperation;

public class StringComparison {
	
	boolean flag=false;
	
	public boolean compareString(String s1,String s2) {
		
		if(s1.equals(s2)) {
			System.out.println("Both String are same");
			return true;
		}
		else {
			System.out.println("Both String are different");
			return false;
		}
		
	}
}
