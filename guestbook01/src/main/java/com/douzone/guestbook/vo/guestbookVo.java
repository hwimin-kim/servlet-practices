package com.douzone.guestbook.vo;

import java.util.Date;

public class guestbookVo {
	private Long no;
	private String name;
	private String password;
	private String message;
	private Date regDate;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date now2) {
		this.regDate = now2;
	}
	@Override
	public String toString() {
		return "guestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", message=" + message + ", now="
				+ regDate + "]";
	}
}
