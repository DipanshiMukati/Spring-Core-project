// in this class we use two class  person bean  and userbean  and make one xml file called Multiple xml file we 
// import  both xml path  in Multiple.xml file 
//context.getBean(UserBean.class);(when we use this cond we do no need to typecast)

//  userbean + personBean  ---->Multiple.xml ----> TestMultiple 

package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.bean.Person;
import com.rays.bean.UserBean;

public class TestMultiple {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");

		UserBean user = (UserBean) context.getBean("user");// context.getBean(UserBean.class);

		Person person = (Person) context.getBean("personBean"); // context.getBean(Person.class);

		System.out.println("User Name: " + user.getLogin());
		System.out.println("User Password: " + user.getPassword());
		System.out.println("Person Name: " + person.getName());
	}

}