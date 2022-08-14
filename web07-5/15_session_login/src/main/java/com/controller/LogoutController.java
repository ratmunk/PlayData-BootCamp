package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;


@WebServlet("/logout")
public class LogoutController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    // 세션 사용
		//1. 세션얻기
		HttpSession session =
				request.getSession();
		
		//2. 세션에 저장된 데이터 얻기
		MemberDTO dto = 
				(MemberDTO)session.getAttribute("login");
		
		if(dto == null) {
			// LoginControlle를 거치지 않고 직접 LoginInfoController로 요청한 경우
			// 또는 LoginControlle를 거치긴 했는데 time-out 된 경우
			response.sendRedirect("loginUI");
		}else {
			//세션 제거
			session.invalidate();
			response.sendRedirect("success.jsp");
		}
		 
		
	}//end doGet


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
