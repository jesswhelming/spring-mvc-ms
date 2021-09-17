<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8">
</head>
<body>
<h1>
	SPRING MISSION 004  
</h1>
<form name="regForm" action="/board/register" method="POST">
</form>
<form name="modForm" action="/board/modify" method="POST">
</form>
<form name="rmForm" action="/board/remove" method="POST">
</form>
<button onclick="location.href='/board/register'">register (GET)</button><br>
<button onclick="javascript:document.regForm.submit();">register (POST)</button><br>
<button onclick="location.href='/board/modify'">modify (GET)</button><br>
<button onclick="javascript:document.modForm.submit();">modify (POST)</button><br>

<input type="text"><button onclick="location.href='/board/read/10'">read (GET)</button><br>
<button onclick="location.href='/board/list'">list (GET)</button><br>
<button onclick="javascript:document.rmForm.submit();">remove (POST)</button><br>
</body>
</html>
