package CollectionFramework.ownhashingtechnique;

import java.util.concurrent.CopyOnWriteArrayList;

public class OwnHashingTechProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(101, "Eren", 1000, "test", "pune");
		Employee employee2 = new Employee(103, "Erwin", 2000, "dev", "nagpur");
		Employee employee3 = new Employee(102, "Levi", 4000, "HR", "mumbai");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
