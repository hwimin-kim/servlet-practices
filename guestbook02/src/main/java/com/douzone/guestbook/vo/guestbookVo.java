package com.douzone.guestbook.vo;

public class guestbookVo {
	private Long no;
	private String name;
	private String password;
	private String message;
	private String  regDate;
	
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
	public String  getRegDate() {
		return regDate;
	}
	public void setRegDate(String  now2) {
		this.regDate = now2;
	}
	@Override
	public String toString() {
		return "guestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", message=" + message + ", now="
				+ regDate + "]";
	}
}
