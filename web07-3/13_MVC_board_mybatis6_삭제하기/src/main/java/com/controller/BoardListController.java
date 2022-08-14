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
import com.dto.PageDTO;
import com.service.BoardService;
import com.service.BoardServiceImpl;


@WebServlet("/list")
public class BoardListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//현재 페이지 번호
		String curPage = request.getParameter("curPage");
		if(curPage == null) {
			curPage = "1";
		}

		//검색 파라미터 얻기
		String searchName = request.getParameter("searchName");
		String searchValue = request.getParameter("searchValue");
		
		
		//비즈니스 로직처리
		BoardService service = new BoardServiceImpl();
		PageDTO pageDTO = service.list(searchName, searchValue, Integer.parseInt(curPage));
		
		System.out.println(pageDTO.getList().size()+ ">>>>>>>>>>>" + pageDTO.getList() );
		
		//데이터 전달 => scope 이용
		request.setAttribute("pageDTO", pageDTO);
		request.setAttribute("searchName", searchName);
		request.setAttribute("searchValue", searchValue);
		
		// jsp에게 요청(위임)
		RequestDispatcher dispatch =
				request.getRequestDispatcher("list.jsp");
		dispatch.forward(request, response);
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
