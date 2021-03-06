package com.douzone.guestbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.guestbook.dao.guestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("a");
		
		if("deleteform".equals(action)) {
			String no = request.getParameter("no");
			request.setAttribute("no", no);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
			rd.forward(request, response);
		} else if("add".equals(action)) {
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String message = request.getParameter("message");
			GuestbookVo vo = new GuestbookVo();
			vo.setName(name);
			vo.setPassword(password);
			vo.setMessage(message);
			
			new guestbookDao().insert(vo);
			
			response.sendRedirect(request.getContextPath() + "/gb");
			
		} else if("delete".equals(action)) {
			String no = request.getParameter("no");
			String formPassword = request.getParameter("password");
			GuestbookVo vo = new guestbookDao().findByPassword(Long.parseLong(no)).get(0);
			String guestbookPassword = vo.getPassword();
			
			if(formPassword.equals(guestbookPassword)){
				new guestbookDao().delete(Long.parseLong(no));
				response.sendRedirect(request.getContextPath() + "/gb");
			} else {
				response.sendRedirect(request.getContextPath() + "/gb?a=deleteform&no=" + no);
			}
		} else {
			List<GuestbookVo> list = new guestbookDao().findAll();
			
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);	
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
