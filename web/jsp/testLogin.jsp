<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id ="jiyoon";
String pwd="1234";
String name="한지윤";
request.setCharacterEncoding("UTF-8");
if(id.equals(request.getParameter("id")) &&
		pwd.equals(request.getParameter("pwd")) ) {
	response.sendRedirect("main2.jsp?name=" + URLEncoder.encode(name, "UTF-8"));		
} else {
response.sendRedirect("loginForm.jsp");
}
%>