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
	<H1>List</H1>
	<H1>목록화면</H1>
	<a href="javascript:document.regForm.submit();">등록</a>
	<a href="/board/get?read">읽기</a>
	<a href="/">home</a>
</body>
</html>