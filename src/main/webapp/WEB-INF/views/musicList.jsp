<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Musics List</title>
</head>
<body>
	<h1>Musics List</h1>
	<table class="table table-striped table-hover">
	<tr>
      <th>#</th>
      <th>Title</th>
      <th>Singer</th>
      <th>Composer</th>
      <th>Writer</th>
      <th>Detail</th>
      <th>Favorite</th>
    </tr>	
	<c:forEach var="music" items="${musicList}" varStatus="index">
	<tr>
		<td>${index.count}</td>
		<td>${music.title}</td>
		<td>${music.singer}</td>
		<td>${music.composer}</td>
		<td>${music.writer}</td>	
		<td><a href="/MusicSalon/music/${music.id}">Detail</a></td>
		<td><a href="/MusicSalon/addFavorite/${music.id}" >Add To Favorites</a></td>
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>
