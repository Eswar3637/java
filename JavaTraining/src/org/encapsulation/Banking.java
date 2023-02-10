package org.encapsulation;

public class Banking {

	private int userid;
	private String username,password;
	private long phn;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setPhn(long phn){
		this.phn = phn;
		
	}
	public long getPhn()
	{
		return phn;
		
	}
	
	
	

}
