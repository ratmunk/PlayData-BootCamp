package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//FirstController 요청시 사용하는 필터
public class MyFilter implements Filter {
  
	public void destroy() {
		System.out.println("destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter 전~~~~~~");
		chain.doFilter(request, response);
		System.out.println("doFilter 후~~~~~~");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init");

	}

}
