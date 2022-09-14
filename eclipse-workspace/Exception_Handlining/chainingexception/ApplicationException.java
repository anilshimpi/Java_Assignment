package Exception_Handlining.chainingexception;

public class ApplicationException extends Exception{

	public ApplicationException(Exception e) {
		
		super(e);
	}
}
