package com.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SetCookieController")
public class SetCookieController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 쿠키 생성
		// 1. 쿠키 생성
		
		Cookie c = new Cookie("k", "hello");

		//time-out 지정 ==> 파일에 저장
		c.setMaxAge(60*60*24); //1일
		
		// 2. 쿠키를 클라이언트에 전달 ( 기본은 브라우저에 저장 )
		response.addCookie(c);
		
		
		// jsp 위임
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
