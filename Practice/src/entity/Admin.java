package entity;

import java.io.Serializable;

public class Admin implements Serializable {
	private int userid;
	private String username;
	private String userpwd;
	
	public Admin() {
	}

	public Admin(int userid, String username, String userpwd) {
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
	}

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

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
}
