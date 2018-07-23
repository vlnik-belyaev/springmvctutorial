package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vbelyaev on 7/22/18.
 */
public class MainApp04 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans05.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
    }
}