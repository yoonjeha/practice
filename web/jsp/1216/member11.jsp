<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*,prac1215.*"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="m1" class="prac1215.MemberBean2" />
<jsp:setProperty property="*" name="m1"/>
<jsp:useBean id="addr" class="prac1215.Address" />
<jsp:setProperty name="addr" property="city" value="서울"/>
<jsp:setProperty name="addr" property="zipcode" value="07654"/>
<% m1.setAddress(addr); %>
<%-- ${부모빈이름.자식속성이름.속성이름} --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title></head>
<body>
	<table border=1 align="center">
		<tr align="center" bgcolor="#99ccff">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="5%"><b>이름</b></td>
			<td width="5%"><b>이메일</b></td>
			<td width="5%"><b>도시</b></td>
			<td width="5%"><b>우편번호</b></td>
		</tr>
		<tr align="center">
			<td>${m1.id } </td>
			<td>${m1.pwd } </td>
			<td>${m1.name } </td>
			<td>${m1.email } </td>
			<td><%=m1.getAddress().getCity() %></td>
			<td><%=m1.getAddress().getZipcode() %></td>
		</tr>
		<tr align="center">
			<td>${m1.id } </td>
			<td>${m1.pwd } </td>
			<td>${m1.name } </td>
			<td>${m1.email } </td>
			<td>${m1.address.city } </td>
			<td>${m1.address.zipcode } </td>
		</tr>
</body>
</html>