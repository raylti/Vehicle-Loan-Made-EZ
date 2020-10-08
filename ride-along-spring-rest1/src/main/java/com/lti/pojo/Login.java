/**
 * Pojo class for storing email and password for verification.
 * @author: Yugandhara
 * @Version:1.0
  
 */

package com.lti.pojo;

public class Login {

	private String email;
	private String password;
	
	public Login() {
	}
	
	public Login(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
