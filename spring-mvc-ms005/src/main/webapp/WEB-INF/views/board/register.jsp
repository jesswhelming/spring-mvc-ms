<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>SPRING MISSION 005</title>
</head>
<form name="regForm" action="/board/post?register" method="POST">
</form>
<body>
	<H1>REGISTER</H1>
	<H1>등록화면</H1>
	<button onclick="javascript:document.regForm.submit();">등록</button><br>
	<a href="/board/get?list">LIST</a>
	<a href="/">HOME</a>
</body>
</html>