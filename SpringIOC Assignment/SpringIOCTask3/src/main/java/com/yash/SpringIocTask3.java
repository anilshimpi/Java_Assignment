package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocTask3 {

	public static void main(String[] args) {
		// SpringApplication.run(SpringIocTask21Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Shape s1 = (Rectangle) context.getBean("rectangle");
		Shape s2 = (Parallelogram) context.getBean("parallelogram");
		Shape s3 = (Triangle) context.getBean("triangle");

		s1.draw();
		s2.draw();
		s3.draw();

	}

}
