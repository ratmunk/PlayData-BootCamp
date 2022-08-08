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


@WebServlet("/write")
public class DeptWriteController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		System.out.println(deptno+" "+dname+" "+ loc);
		
		DeptService service = new  DeptServiceImpl();
		DeptDTO dto = new DeptDTO( Integer.parseInt(deptno), dname, loc);
		int num = service.write(dto);
		
		//응답처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		if(num==1) {
		  out.print("부서등록 성공");	
		  out.print("<a href='list'>목록</a>");	
		}
		out.print("</body></html>");
	}//end doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
