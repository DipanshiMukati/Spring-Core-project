//**1 day**

// first go in user bean define attribute  make setter methods and constructor 
//after go in xml file  create bean set valuefor setter method   use property tag  and
//  for consturator set <constructor-arg  tag  then go in test class 


package com.rays.bean;

public class UserBean {

	
	private String login = null;
	private String password = null;
	
	private UserBean () {
		
	}
      
	
	private UserBean (String login ,String password) {
		this.login =login;
		this.password = password;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
