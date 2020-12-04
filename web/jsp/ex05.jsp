<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	response 객체 메소드
	getCharacterEncoding() : 응답할 때 문자 인코딩을 얻어올 때
	addCookie(Cookie) : 쿠키를 지정할 때
	sendRedirect(URL) : 이동하고자 하는 URL을 지정할 때
 -->
 <%! int age; %>
 <%
 	String str = request.getParameter("age");
 	// input_age.html에 있는 input의  name이 "age"인 값을 받아옴
 	age = Integer.parseInt(str);
 	
 	if(age >= 19) {
 		response.sendRedirect("a.jsp?age="+age);
 	} else {
 		response.sendRedirect("b.jsp?age="+age);
 	}
 %>
</body>
</html>