package com.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetCookieController")
public class GetCookieController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 쿠키 사용
		Cookie [] cookies = 
				request.getCookies();
		for (Cookie c : cookies) {
		   if("k".equals(c.getName())) {
			   String currentDate =
					   c.getValue();
			   System.out.println("쿠키저장된 시간" + currentDate);
		   }else {
			   System.out.println("저장된 쿠키 없음" );
		   }
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
