<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
자바 코드 <hr>
<% if(request.getParameter("id") != null){ %>
== 연산자 사용 결과 : <%=request.getParameter("id")=="pink" %><br>
equals() 사용 결과 : <%=request.getParameter("id").equals("pink") %><br>
<% }else{
out.print("id를 전달해 주세요.");
}
%>
</body>
</html>