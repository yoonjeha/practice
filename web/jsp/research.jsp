<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
b {
	font-size: 16pt;
}
</style>
</head>
<body>
	<h2>설문 조사 결과</h2>
	<%
		request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	out.println("이름 : <b>" + name +"</b><br>");
	
	String gender = request.getParameter("gender");
	out.println("성별 : ");
	if (gender.equals("male")) {
		out.println("<b>남자</b><br>");
	} else {
		out.println("<b>여자</b><br>");
	}
	
	String seasonArr[] = request.getParameterValues("season");
	out.println("당신이 좋아하는 계절은");
	for (String season:seasonArr) {
		int n= Integer.parseInt(season);
		switch (n) {
		// 입니다가 반복되는게 미관상 좋지 않아 계절만 나열한 후에 마지막에 입니다를 한번만 출력함.
		case 1: out.println("<b> 봄 </b>");
		break;
		case 2: out.println("<b> 여름 </b>");
		break;
		case 3: out.println("<b> 가을 </b>");
		break;
		case 4: out.println("<b> 겨울 </b>");
		break;
		}
	}
	out.println("입니다.");
	// 꼭 for문 바깥에 적어야함 switch문 바깥에 적으면 break;되고 println출력 그리고 다시 for문이 반복되기
	// 때문에 중복 선택의 경우 입니다가 여전히 반복됨.
	%>
	<br>
	<b><a href='javascript:history.go(-1)'>다시</a></b>
</body>
</html>