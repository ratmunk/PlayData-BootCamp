package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;


@WebServlet("/list")
public class DeptListController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DeptService service = new DeptServiceImpl();
		List<DeptDTO> list  = service.list();
		System.out.println(list);
		
		//응답처리
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<th>부서번호</th>");
		out.print("<th>부서명</th>");
		out.print("<th>부서위치</th>");
		out.print("</tr>");

		for(DeptDTO dto : list) {
		  out.print("<tr>");
		  out.print("<td>"+dto.getDeptno()+"</td>");
		  out.print("<td>"+dto.getDname()+"</td>");
		  out.print("<td>"+dto.getLoc()+"</td>");
		  out.print("</tr>");
		}
		
		out.print("</table>");
		out.print("<a href='writeForm.jsp'>글쓰기</a>");
		out.print("</body></html>");
		
	}//end doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
