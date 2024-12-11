

package com.rays.child;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChild {

	public static void main(String[] args) {
		System.out.println("1111111111111");

		ApplicationContext context = new ClassPathXmlApplicationContext("child.xml");

		TestBean testBean = (TestBean) context.getBean("derivedTestBean");

		System.out.println(testBean.toString());

	}

}
