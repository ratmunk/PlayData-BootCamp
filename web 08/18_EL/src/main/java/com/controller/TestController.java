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

import com.dto.User;


@WebServlet("/TestController")
public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request scope에 값 저장
		//1. 단일값
		request.setAttribute("userid", "abc1234");
		
		//2. DTO
		User user = new User("홍길동", 20 );
		request.setAttribute("user", user);
		
		//3. List
		List<User> list = Arrays.asList(new User("홍길동1", 30 ),
				                        new User("홍길동2", 40 ));
		request.setAttribute("user_list", list);
		
		// jsp 위임 ==> forward
		RequestDispatcher dispatch =
				 request.getRequestDispatcher("test.jsp");
		dispatch.forward(request, response);
		
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
