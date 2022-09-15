package personInhritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department dep=new Department();
		dep.setDeptid(11);
		dep.setDname("abc");
		Employee e=new Employee("24-08-22","pune","xyz","xyz@yash.com",dep);
		//Custermor c=new Custermor();
		
	}

}
