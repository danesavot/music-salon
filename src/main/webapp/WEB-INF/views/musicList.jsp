<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Musics List</title>
</head>
<body>
	<h1>Musics List</h1>
	<table>
	<c:forEach var="music" items="${musicList}">
	<tr>
		<td>${music.title}</td>
		<td>${music.singer}</td>
		<td>${music.composer}</td>
		<td>${music.writer}</td>
		<td><a href="music/${music.id}">Detail</a></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="addMusic"> Add a new Music</a>
</body>
</html>