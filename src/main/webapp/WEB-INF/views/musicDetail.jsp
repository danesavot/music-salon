<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Music Detail</title>
</head>
<body>
	<h1>Music Detail</h1>

<object width="300" height="42">
<param name="src" value="${music.fileName}">
<param name="autoplay" value="false">
<param name="controller" value="true">
<param name="bgcolor" value="#FFFFFF">
<embed src="/MusicSalon/music/file/${music.fileName}" autostart="false" loop="false" width="300" height="80" controller="true">
</object>
	
	<table>
	<tr>
		<td>Title:</td>
		<td>${music.title}</td>
		<td></td>
	</tr>
	<tr>
		<td>Singer:</td>
		<td>${music.singer}</td>
		<td></td>
	</tr>
	<tr>
		<td>Composer:</td>
		<td>${music.composer}</td>
		<td></td>
	</tr>
	<tr>
		<td>Writer:</td>
		<td>${music.writer}</td>
		<td></td>
	</tr>

 	<tr>
		<td>Album:</td>
		<td><a href="/MusicSalon/music?album=${music.album.id}">${music.album.name}</a></td>
		<td></td>
	</tr>

 	<tr>
		<td>Categories:</td>
		<td></td>
		<td></td>
	</tr>

	<c:forEach var="category" items="${music.categoryList}">
	<tr>
		<td><a href="/MusicSalon/categories/${category.id}">${category.name}</a></td>
		<td></td>
	</tr>
	</c:forEach>
	
	</table>
	
</body>
</html>