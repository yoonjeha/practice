<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! int age; %> 
	<!-- 변수 선언부 -->
	<%
		String str = request.getParameter("age");
		age = Integer.parseInt(str);
	%>
		당신은<%=age %>세 입니다.
		당신은 미성년자 입니다. 사이트를 이용이 불가합니다. <br>
		<a href="input_age.html">처음으로</a>
</body>
</html>