package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/TestController")
public class TestController extends HttpServlet {

	//인스턴스 변수, 서블릿은 단한번만 생성되기 때문에 변수도 한번만 생성됨. 따라서 여러 사용자가 변수를 공유할 수 있다.
	ArrayList<String> list = new ArrayList<String>(); 
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 여러 사용자가 공유할 목적인 경우는 인스턴스 변수로 만들고
		// 공유하지 않고 로컬형태로 사용할 목적인 경우는 doGet메서드내의 로컬변수로 사용해야 된다.
		System.out.println("doGet");
		list.add("hello");
		System.out.println(list);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
