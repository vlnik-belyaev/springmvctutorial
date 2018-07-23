package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp03 {
   public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("Beans01.xml");
HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
   }
}