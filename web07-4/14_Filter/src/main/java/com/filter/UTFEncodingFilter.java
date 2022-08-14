package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//모든 요청시 사용하는 필터
public class UTFEncodingFilter implements Filter {
  
	public void destroy() {
		System.out.println("UTFEncodingFilter destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("UTFEncodingFilter  doFilter 전~~~~~~");
		//POST 한글처리
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		System.out.println("UTFEncodingFilter doFilter 후~~~~~~");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("UTFEncodingFilter init");

	}

}
