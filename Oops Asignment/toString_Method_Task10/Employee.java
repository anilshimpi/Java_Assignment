package toString_Method;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employee {

	int empid;
	String empname;
	double empsalary;
	String empaddress;
	Date emp_dob;
	Date emp_doj;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public Date getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}
	public Date getEmp_doj() {
		return emp_doj;
	}
	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_doj=" + emp_doj ;
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Date d1=new Date();
		SimpleDateFormat dob=new SimpleDateFormat("07/02/2022");
		
		emp.setEmpid(11);
		emp.setEmpname("XYZ");
		emp.setEmpsalary(20000.00);
		emp.setEmpaddress("Pune");
		//emp.setEmp_dob(d1.getClass(System.Date("02/01/1990")));
		emp.setEmp_doj(d1);
		//emp.setEmp_dob();		
		
		System.out.println(emp.toString()+",emp_dob="+dob.format(d1)+ "]");
		
		
	}
	
}
