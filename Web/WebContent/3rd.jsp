<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- ����Ʈ -->
<meta name="viewport" content="width=device-width" initial-scale="1">
<!-- ��Ÿ�Ͻ�Ʈ ����  -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<title></title>
</head>
<body>
	<!-- �׺���̼� -->
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expaned="false">
				<span class="icon-bar"></span><span class="icon-bar"></span>
				<span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="main.jsp">�ΰ��ü����</a>
			</div>
			<div class="collaspe navbar-collapse" id="#bs-example-navbar-collapse-1">
				<div style="float:right;">
				<ul class="nav navbar-nav">
					<li><a href="main.jsp">����</a></li>
					<li><a href="main.jsp">���� ���� ������</a></li>
					<li class="active"><a href="main.jsp">��ǰ ���� �Խ���</a></li>
					<li><a href="main.jsp">���� �Խ���</a></li>
					
				</ul>
		</div>
	</nav>
	<div class="container">
		<div class="row">
			<h4>��ǰ ���� �Խ���</h4>
		</div>
	</div>
	
	<!-- �Խ��� -->
	<div class="container">
		<div class="row">
			<table class="table table-striped"
				style="text-align: center; border: 1ps solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">��ȣ</th>
						<th style="background-color: #eeeeee; text-align: center;">����</th>
						<th style="background-color: #eeeeee; text-align: center;">�ۼ���</th>
						<th style="background-color: #eeeeee; text-align: center;">�ۼ���</th>
						<th style="background-color: #eeeeee; text-align: center;">��õ��</th>
						<th style="background-color: #eeeeee; text-align: center;">��ȸ��</th>
					</tr>
				</thead>
				<tbody>
				<tr>
                    <td>1</td>
                    <td><strong>�ȳ��ϼ���</strong></td>
                    <td>���̸�</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
                    <tr>
                    <td>7</td>
                    <td><strong>�ȳ��ϼ���</strong></td>
                    <td>���̸�</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
					<tr>
                    <td>11</td>
                    <td><strong>�ȳ��ϼ���</strong></td>
                    <td>���̸�</td>
                    <td>2020-12-28</td>
                    <td>3</td>
                    <td>0</td>
                    </tr>
                    <tr>
                    <td>2</td>
                    <td>! �Ʋ��� ��� ��õ ! </td>
                    <td>����</td>
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
            <a href="write.jsp" class="btn btn-primary pull-right">�۾���</a>
		</div>
	</div>
	
	<footer>
	
	</footer>
	<!--  �ִϸ��̼� ��� JQUERY -->
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!--  ��Ʈ��Ʈ�� JS -->
	<script src="js/bootstrap.js"></script>
</body>
</html>