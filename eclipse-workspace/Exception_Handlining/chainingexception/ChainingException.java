package Exception_Handlining.chainingexception;

public class ChainingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			test();

		}

		catch (ApplicationException e) {
			System.out.println(e);

		}

	}

	public static void test() throws ApplicationException {
		int a = 12;
		int b = 0;
		try {
			System.out.println(a/b);
		} 
		catch (Exception e) {
			
			throw new ApplicationException(e);
		}

	}

}
