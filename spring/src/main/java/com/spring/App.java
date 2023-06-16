package com.spring;


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
       
        ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
        Student Student1 =(Student) context1.getBean("Student1");
        System.out.println(Student1);
    }
}
