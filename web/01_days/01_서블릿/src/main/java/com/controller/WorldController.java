package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web.xml 이용해서 서블릿 매핑하자.
public class WorldController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//원래는 JSP에게 위임해야 되는데... 지금은 서블릿이 직접 응답처리한다.
		//서블릿의 응답처리 ==> html 작성하는 작업 의미
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
	    out.print("<h1>안녕하세요, WorldController~</h1>");
		out.print("</body></html>");
	}//end doGet
}//end class
