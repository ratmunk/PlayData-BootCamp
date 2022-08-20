<%@page import="com.dto.goods.GoodsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<table width="100%" cellspacing="0" cellpadding="0">
	<tr>
		<td>
			<table align="center" width="710" cellspacing="0" cellpadding="0"
				border="0">
				
				<tr>
					<td height="5"></td>
				</tr>
				<tr>
					<td height="1" colspan="8" bgcolor="CECECE"></td>
				</tr>
				<tr>
					<td height="10"></td>
				</tr>
				<tr>
    <% List<GoodsDTO> list = (List<GoodsDTO>)request.getAttribute("goodsList");
        for(int i=0;i<list.size();i++){
        	GoodsDTO dto = list.get(i);
        	String gCode = dto.getgCode();
        	   String gCategory = dto.getgCategory();
        	   String gName = dto.getgName();
        	   String gContent = dto.getgContent();
        	   int gPrice = dto.getgPrice();
        	   String gImage = dto.getgImage();
    %>
						<td>
							<table style='padding:15px'>
								<tr>
									<td>
										<a href=""> 
											<img src="images/items/<%= gImage%>.gif" border="0" align="center" width="200">
										</a>
									</td>
								</tr>
								<tr>
								
									<td height="10">
								</tr>
								<tr>
									<td class= "td_default" align ="center">
										<a class= "a_black" href="GoodsRetrieveServlet?gCode=${xxx.gCode}"> 
										<%= gName%><br>
										</a>
										<font color="gray">
										 --------------------
										</font>
									</td>
									
								</tr>
								<tr>
									<td height="10">
								</tr>
								<tr>
									<td class="td_gray" align ="center">
										<%= gContent%>
									</td>
								</tr>
								<tr>
									<td height="10">
								</tr>
								<tr>
									<td class="td_red" align ="center"><font color="red"><strong>
									<%= gPrice%>	</strong></font></td>
								</tr>
							</table>
						</td>

  					
  					<%
  				       if((i+1)%5==0){
  					%>	
						     <tr>
								<td height="10">
							</tr>
<%
          }//end if
        }//end for
%>
			</table>
		</td>
	</tr>
	<tr>
		<td height="10">
	</tr>
</table>