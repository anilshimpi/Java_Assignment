package com.yash.SpringIOCTask5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		PrintMessage msg = context.getBean("printMessage", PrintMessage.class);
		System.out.println(msg.getMessage());
	}
}
