<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 표현언어 같은 속성 우선순위 request가 session보다 높음 --%>
<%
	request.setCharacterEncoding("utf-8");
	request.setAttribute("id","hong");
	request.setAttribute("pwd","1234");
	session.setAttribute("name","홍길동");
	application.setAttribute("email","hong@email.com");
	request.setAttribute("address","서울시 관악구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward2</title>
</head>
<body>
	<jsp:forward page="member12.jsp"/>
</body>
</html>