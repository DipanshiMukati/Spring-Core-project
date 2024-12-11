// there are two types of container  
// 1.bean factory ( parent )  &  2.ApplicationContext (child )
// we use ApplicationContext in this class 


package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.bean.Person;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Person.xml");

		Person person = (Person) context.getBean("personBean");

		System.out.println("Person's name: " + person.getName());

	}

}