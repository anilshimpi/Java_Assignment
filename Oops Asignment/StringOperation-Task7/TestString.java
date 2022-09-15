package StringOperation;

public class TestString extends StringComparison {

	//boolean flag;
	@Override
	public boolean compareString(String s1,String s2) {
		
	
			if(s1.equalsIgnoreCase(s2)) {
				
				System.out.println("Name is same");
				return true;
			}
			else {
				
			System.out.println("Name is differnt");
			return false;
			}
			
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringComparison comparison= new StringComparison();
		String s1=new String("Anil");
		String s2=new String("Ani");
		
		StringComparison charComp= new TestString();
		
		String s3=new String("A");
		String s4=new String("a");
		
		comparison.compareString(s1, s2);
		charComp.compareString(s3, s4);
		
	}

}
