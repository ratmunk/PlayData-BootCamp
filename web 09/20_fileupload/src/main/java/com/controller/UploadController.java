package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/upload")
public class UploadController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 파일업로드 파라미터 처리는 이전 방식의 rquest.getParameter("key") 사용불가
		// request.setCharacterEncoding("UTF-8");
		
		//메뉴얼에서 확인후 복사해서 사용.
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Configure a repository (to ensure a secure temp location is used)
		ServletContext servletContext = this.getServletConfig().getServletContext();
		File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
		factory.setRepository(repository);

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request
		String fileName = null;
		String contentType = null;
		long sizeInBytes = 0;
		
		try {
			List<FileItem> items = upload.parseRequest(request);
			// Process the uploaded items
			/*
			[name=null, StoreLocation=null, size=4 bytes, 
			isFormField=true, 
			FieldName=theText, 
			name=ZoomIt.zip, 
			StoreLocation=C:\\web_study\\apache-tomcat-8.5.81\\work\\Catalina\\localhost\\app20\\upload_4f1763f3_4416_45a1_99cd_91f587c7ca9b_00000001.tmp, 
			size=1000879 bytes, 
			
			isFormField=false, 
			FieldName=theFile]
			*/
			Iterator<FileItem> iter = items.iterator();
			while (iter.hasNext()) {
			    FileItem item = iter.next();
			    // FileItem에는 2가지 타입이 저장됨( 1. 바이너리(파일)  2. 텍스트
			    if (item.isFormField()) {
			        // type="text" 등.. type="file"아닌 파라미터 처리
			    	String name = item.getFieldName();
			        String value = item.getString("utf-8");
			    	System.out.println(name);
			    	System.out.println(value);
			    	
			    } else {
			        // type="file" 파라미터 처리
			    	String fieldName = item.getFieldName(); // theFile
			         fileName = item.getName();   // 파일명 ZoomIt.zip
			         contentType = item.getContentType(); // 업로드 파일타입
			        boolean isInMemory = item.isInMemory();
			         sizeInBytes = item.getSize();  // 업로드 파일 크기
			    	
			        System.out.println(fieldName);
			        System.out.println(fileName);
			        System.out.println(contentType);
			        System.out.println(isInMemory);
			        System.out.println(sizeInBytes);
			    	
			        // c:\\upload 폴더에 저장
			        File saveFile = new File("c:\\upload", fileName);
			        
			        try {
						item.write(saveFile);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			    }//end if~else
			}//end while
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// jsp 위임
		request.setAttribute("fileName", fileName);
		request.setAttribute("contentType", contentType);
		request.setAttribute("sizeInBytes", sizeInBytes);
		
		
		request.getRequestDispatcher("info.jsp").forward(request, response);
		
	}//end doGet


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
