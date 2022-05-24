<%@page import="com.douzone.guestbook.vo.guestbookVo"%>
<%@page import="com.douzone.guestbook.dao.guestbookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	String no = request.getParameter("no");
	String formPassword = request.getParameter("password");
	guestbookVo vo = new guestbookDao().findByPassword(Long.parseLong(no)).get(0);
	String guestbookPassword = vo.getPassword();
	
	if(formPassword.equals(guestbookPassword)){
		new guestbookDao().delete(Long.parseLong(no));
		response.sendRedirect("/guestbook01");
	} else {
		response.sendRedirect("/guestbook01/deleteform.jsp?no=" + no);
	}
%>    
    
