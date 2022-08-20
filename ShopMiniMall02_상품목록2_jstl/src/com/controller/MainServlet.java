package com.controller;

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


@WebServlet("/main")
public class MainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//상품 데이터를 DB에 가져와서 request scope에 저장.
		String gCategory = "bottom";
		
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

}
