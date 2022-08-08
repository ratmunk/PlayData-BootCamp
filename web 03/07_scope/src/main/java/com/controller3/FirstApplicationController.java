package com.controller3;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstApplicationController")
public class FirstApplicationController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FirstApplicationController");

		//application scope 저장
		ServletContext ctx = getServletContext();
		
		ctx.setAttribute("username", "유관순");
		
		String username = (String)ctx.getAttribute("username");
		System.out.println("FirstApplicationController application scope:" + username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
