<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 뷰포트 -->
<meta name="viewport" content="width=device-width" initial-scale="1">
<!-- 스타일시트 참조  -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<title></title>
</head>
<body>
	<!-- 네비게이션 -->
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expaned="false">
				<span class="icon-bar"></span><span class="icon-bar"></span>
				<span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="main.jsp">로고대체예정</a>
			</div>
			<div class="collaspe navbar-collapse" id="#bs-example-navbar-collapse-1">
				<div style="float:right;">
				<ul class="nav navbar-nav">
					<li><a href="main.jsp">메인</a></li>
					<li><a href="main.jsp">냥이 사진 갤러리</a></li>
					<li class="active"><a href="main.jsp">용품 정보 게시판</a></li>
					<li><a href="main.jsp">문의 게시판</a></li>
					
				</ul>
		</div>
	</nav>
	<div class="container">
		<div class="row">
			<h4>용품 정보 게시판</h4>
		</div>
	</div>
	
	<!-- 게시판 -->
	<div class="container">
		<div class="row">
			<table class="table table-striped"
				style="text-align: center; border: 1ps solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">번호</th>
						<th style="background-color: #eeeeee; text-align: center;">제목</th>
						<th style="background-color: #eeeeee; text-align: center;">작성자</th>
						<th style="background-color: #eeeeee; text-align: center;">작성일</th>
						<th style="background-color: #eeeeee; text-align: center;">추천수</th>
						<th style="background-color: #eeeeee; text-align: center;">조회수</th>
					</tr>
				</thead>
				<tbody>
				<tr>
                    <td>1</td>
                    <td><strong>안녕하세요</strong></td>
                    <td>꿈이맘</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
                    <tr>
                    <td>7</td>
                    <td><strong>안녕하세요</strong></td>
                    <td>꿈이맘</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
					<tr>
                    <td>11</td>
                    <td><strong>안녕하세요</strong></td>
                    <td>꿈이맘</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
                    <tr>
                    <td>2</td>
                    <td>! 아깽이 사료 추천 ! </td>
                    <td>꽁이</td>
                    <td>2020-12-28</td>
                    <td>98</td>
                    <td>35</td>
                    </tr>
                    <tr>
                    <td>3</td>
                    <td>test</td>
                    <td>test</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
                    <tr>
                    <td>4</td>
                    <td>test</td>
                    <td>test</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
                 </tbody>
               </table>
            <a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a>
		</div>
	</div>
	
	<footer>
	
	</footer>
	<!--  애니매이션 담당 JQUERY -->
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!--  부트스트랩 JS -->
	<script src="js/bootstrap.js"></script>
</body>
</html>