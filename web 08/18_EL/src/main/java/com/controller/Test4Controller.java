package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.User;


@WebServlet("/Test4Controller")
public class Test4Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		ServletContext application = getServletContext();
		
	
		// 3개의 scope에 동일한 key로 값 저장
		request.setAttribute("userid", "request");
		session.setAttribute("userid", "session");
		application.setAttribute("userid", "application");
		
		
		RequestDispatcher dispatch =
				 request.getRequestDispatcher("test4.jsp");
		dispatch.forward(request, response);
		
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
