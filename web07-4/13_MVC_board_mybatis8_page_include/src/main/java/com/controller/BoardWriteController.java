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


@WebServlet("/write")
public class BoardWriteController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//사용자 입력 파라미터 얻기
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		
		BoardService service = new BoardServiceImpl();
		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);
		dto.setAuthor(author);
		dto.setContent(content);

		String nextPage = "list";
		
		try {
			int num = service.write(dto);
		} catch (Exception e) {
			e.printStackTrace();
			nextPage = "error/error.jsp";
		}
		
		// 목록으로 가기 ==> list.jsp로 직접가면 안되고 서블릿 요청
		response.sendRedirect(nextPage);  // BoardListController의 서블릿맵핑값
		
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST용 한글처리
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
