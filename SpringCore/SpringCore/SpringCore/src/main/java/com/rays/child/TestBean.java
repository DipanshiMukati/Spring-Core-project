package com.rays.child;

public class TestBean {

	private String name;
	private int age;


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	
		System.out.println("222");
}

	@Override
	public String toString() {
		return "TestBean [name=" + name + ", age=" + age + "]";
	}


}
