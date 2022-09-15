package com.yash.SpringIOCTask4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Applicationcontext.xml");
      ConstructorMessage msg= context.getBean("printmessage",ConstructorMessage.class);
      System.out.println(msg.getMessage());
    }
}
