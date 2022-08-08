package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/zzz") // 서블릿 mapping
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		//html코드 작성해서 응답처리
		// MIME 타입 (text/html) ==> 웹브라우저에게 처리할 데이터 종류 지정
		// ; charset=utf-8 ==> 한글을 웹브라우저에서 출력
	    // MIME타입을 잘못 지정하면 다운로드 방식으로 처리함.
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
	    out.print("<h1>안녕하세요, Hello~</h1>");
		out.print("</body></html>");
		
		
	}//end doGet

}//end class
