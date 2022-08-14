package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.User;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/TestController3")
public class TestController3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> list = 
				Arrays.asList(new User("홍길동1",20),
						new User("홍길동2",30),
						new User("홍길동3",40),
						new User("홍길동4",50),
						new User("홍길동5",60),
						new User("홍길동6",70));
		
		request.setAttribute("user_list", list);
		
		// jsp 위임
		request.getRequestDispatcher("test3.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
