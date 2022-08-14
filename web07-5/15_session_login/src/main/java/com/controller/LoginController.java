package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;


@WebServlet("/login")
public class LoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		// DB연동해서 검증 처리 ==> 존재한다는 가정		
		/*
		 *  DB연동해서 최소한의 다음 정보를 얻어야 된다.
		 *  
		 *  회원등록시 정보
		 *  1. 아이디
		 *  2. 이름 (홍길동)
		 *  3. ..
		 * 
		 *  MemberDTO 를 반환 받는다.
		 */
		MemberDTO dto = new MemberDTO();
		dto.setUserid(userid);
		dto.setUsername("홍길동");
		
		// dto에 세션에 저장.
		// 1. 세션얻기
		HttpSession session = request.getSession();
		// 2. 세션에 데이터 저장
		session.setAttribute("login", dto);
	  	
		// jsp 위임
		response.sendRedirect("main.jsp");
   		
		
	}//end doGet


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
