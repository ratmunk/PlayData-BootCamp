package com.controller.goods;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.goods.GoodsDTO;
import com.service.goods.GoodsService;
import com.service.goods.GoodsServiceImpl;

/**
 * Servlet implementation class GoodsListServlet
 */
@WebServlet("/GoodsListServlet")
public class GoodsListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String gCategory = request.getParameter("gCategory");
		if(gCategory==null) {
			gCategory ="top";
		}
		
		String next="";
		GoodsService service = new GoodsServiceImpl();
		try {
			List<GoodsDTO> list = service.goodsList(gCategory);
			request.setAttribute("goodsList", list);
			next = "main.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("message", "Main 요청시 예외 발생." );
			next = "error/error.jsp";
			
		}
		
		
		//main.jsp 위임
		request.getRequestDispatcher(next).forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
