<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>SPRING MISSION 005</title>
</head>
<form name="modForm" action="/board/post?modify" method="POST">
</form>
<form name="rmForm" action="/board/post?remove" method="POST">
</form>

<body>
	<H1>READ</H1>
	<H1>읽기화면</H1>
	<button onclick="javascript:document.modForm.submit();">수정</button>
	<button onclick="javascript:document.rmForm.submit();">삭제</button><br>
	<a href="/board/get?list">LIST</a>
	<a href="/">HOME</a>
</body>
</html>