<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>SPRING MISSION 005</title>
</head>
<form name="rmForm" action="/board/post?remove" method="POST">
</form>
<body>
	<H1>REMOVE</H1>
	<H1>삭제화면</H1>
	<button onclick="javascript:document.rmForm.submit();">삭제</button><br>
	<a href="/board/get?list">LIST</a>
	<a href="/">HOME</a>
</body>
</html>