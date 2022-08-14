package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.BoardDTO;
import com.service.BoardService;
import com.service.BoardServiceImpl;


@WebServlet("/retrieve")
public class BoardRetrieveController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 비즈니스 로직 처리
		String num = request.getParameter("num");
	
		BoardService service = new BoardServiceImpl();
		BoardDTO dto = service.retrieve(Integer.parseInt(num));
	
		//데이터 전달 ==> scope 이용
		request.setAttribute("retrieve", dto);
		
		//jsp 요청(위임)
		request.getRequestDispatcher("retrieve.jsp").forward(request, response);
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
