<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--표현 언어(EL, Expression Language : 이렇게 값을 가져오면 편하다-->
${"Hello"} <br>
<%="Hello"%> <br> <!--스크립트릿-->
<% out.println("Hello"); %> <br> <!--표현식( Expression)-->
</body>
</html>