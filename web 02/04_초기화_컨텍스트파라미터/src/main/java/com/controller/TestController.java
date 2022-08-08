package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestController");
		ServletContext ctx = getServletContext();
		String mesg = ctx.getInitParameter("mesg");
		String mesg2 = ctx.getInitParameter("mesg2");
		System.out.println(mesg+" "+mesg2);
		
		// <init-param>으로 설정된 초기화 파라미터는 ServletConfig의 
		// getInitParameter(name) 사용한다. 특정 서블릿 사용 가능.
		String driver = getInitParameter("jdbc.driver");
		String userid = getInitParameter("jdbc.userid");
		System.out.println(driver+" "+userid);
		
		//응답처리 ==> html작성
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("driver:"+driver+"<br>");
		out.print("userid:"+userid);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
