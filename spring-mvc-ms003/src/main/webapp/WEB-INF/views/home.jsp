<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8">
	<style type="text/css">
		td: not(nth-child(2)) {
			text-align: center;
		}
		h1{
			color : black;
		}
		#mission_table  {
			width:80%;
			border: 1px solid black;
		}
		th, td {
			border: 1px solid black;
		}
	</style>
</head>
<body>
<h1>
	SPRING MISSION 003  
</h1>
<table id="mission_table">
	<thead>
		<tr>
			<th>no</th>
			<th>url</th>
			<th>title</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td><a href="/board/register">/board/register</a></td>
			<td>등록</td>		
		</tr>
		<tr>
			<td>2</td>
			<td><a href="/board/modify">/board/modify</a></td>
			<td>수정</td>
		</tr>
		<tr>
			<td>3</td>
			<td><a href="/board/list">/board/list</a></td>
			<td>목록</td>
		</tr>
		<tr>
			<td>4</td>
			<td><a href="/board/read/10">/board/read/10</a></td>
			<td>읽기</td>
		</tr>
		<tr>
			<td>5</td>
			<td><a href="/board/read2/20">/board/read2/100</a></td>
			<td>읽기2</td>
		</tr>
	</tbody>
</table>


</body>
</html>
