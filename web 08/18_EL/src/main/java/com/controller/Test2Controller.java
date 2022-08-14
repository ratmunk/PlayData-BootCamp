package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.User;


@WebServlet("/Test2Controller")
public class Test2Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//session scope에 값 저장
		
		HttpSession session = request.getSession();
		
		//1. 단일값
		session.setAttribute("userid", "abc1234");
		
		//2. DTO
		User user = new User("홍길동", 20 );
		session.setAttribute("user", user);
		
		//3. List
		List<User> list = Arrays.asList(new User("홍길동1", 30 ),
				                        new User("홍길동2", 40 ));
		session.setAttribute("user_list", list);
		
		// jsp 위임 ==> forward 또는 redirect 모두 가능
		RequestDispatcher dispatch =
				 request.getRequestDispatcher("test2.jsp");
		dispatch.forward(request, response);
		
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
