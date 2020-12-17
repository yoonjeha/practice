<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    	request.setCharacterEncoding("utf-8");
    %>
    <c:set var="id" value="hong" scope="page" />
    <c:set var="pwd" value="1234" scope="page" />
    <c:set var="name" value="${'홍길동' }" scope="page" />
    <c:set var="age" value="${22}" scope="page" />
    <c:set var="height" value="${177}" scope="page" />
    <%-- value 속성을 지정하지 않고도 사용이 가능한 예시
    <c:set var="변수이름" [scope="{page|request|session|application}"]>
    </c:set>
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<table border="1" align="center">
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>나이</b></td>
			<td width="7%"><b>키</b></td>
		</tr>
		<tr align="center">
			<td>${id} </td>
			<td>${pwd} </td>
			<td>${name} </td>
			<td>${age} </td>
			<td>${height}</td>
		</tr>
	</table>
</body>
</html>