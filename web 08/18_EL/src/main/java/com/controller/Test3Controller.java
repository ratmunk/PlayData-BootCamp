package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.User;


@WebServlet("/Test3Controller")
public class Test3Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//application scope에 값 저장
		ServletContext application = getServletContext();
		
		//1. 단일값
		application.setAttribute("userid", "abc1234");
		
		//2. DTO
		User user = new User("홍길동", 20 );
		application.setAttribute("user", user);
		
		//3. List
		List<User> list = Arrays.asList(new User("홍길동1", 30 ),
				                        new User("홍길동2", 40 ));
		application.setAttribute("user_list", list);
		
		// jsp 위임 ==> forward 또는 redirect 모두 가능
		RequestDispatcher dispatch =
				 request.getRequestDispatcher("test3.jsp");
		dispatch.forward(request, response);
		
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
