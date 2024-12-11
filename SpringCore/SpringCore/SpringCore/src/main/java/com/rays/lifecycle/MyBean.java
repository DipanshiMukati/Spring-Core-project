package com.rays.lifecycle;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

public class MyBean {

	
	public void init() {
		System.out.println("init method");
	}
	
	public void destroy() {
		System.out.println(" destroy method");
		
	}
	
}
