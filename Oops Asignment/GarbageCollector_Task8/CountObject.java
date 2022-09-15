package GarbageCollector;

public class CountObject{

	
	static CountObject m1(CountObject obj) {
		
		return obj;
		
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountObject obj1=new CountObject();
		CountObject obj2=m1(obj1);
		CountObject obj3= new CountObject();
		obj2=obj3;
		
		try {
			
			obj2.finalize();
		} 
		
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Object 1:"+obj1.hashCode()+" "+"Object 2: "+obj2.hashCode()+" "+"Object 3: "+obj3.hashCode());

	}

}
