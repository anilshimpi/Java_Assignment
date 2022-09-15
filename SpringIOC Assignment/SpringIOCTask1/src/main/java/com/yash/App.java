package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee bean = (Employee) context.getBean("employee");
		System.out.println("empId=" + bean.getEmpId());
		System.out.println("empName=" + bean.getEmpName());
		System.out.println("empRole=" + bean.getEmpRole());
	}

}
