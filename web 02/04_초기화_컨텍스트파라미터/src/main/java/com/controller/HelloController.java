package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloController");
		// <context-param>으로 설정된 컨텍스트 파라미터는 ServletContext의
		// getInitParameter(name) 사용한다. 모든 서블릿이 사용 가능
		
		ServletContext ctx = getServletContext();
		String mesg = ctx.getInitParameter("mesg");
		String mesg2 = ctx.getInitParameter("mesg2");
		System.out.println(mesg+" "+mesg2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
