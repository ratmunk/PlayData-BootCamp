package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstController")
public class FirstController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List list = new ArrayList();
		
		System.out.println("FirstController");
		
		//request scope에 저장
		request.setAttribute("username", "홍길동");
		
		//request scope 값조회 ==> 반드시 저장된 데이터로 형변환 필수
		String username = (String)request.getAttribute("username");
		
		System.out.println("request scope:" + username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
