<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Categories Detail</title>
</head>
<body>
	<h1>Categories Detail</h1>
	<table>
	<tr>
		<td>${category.name}</td>
		<td></td>
	</tr>
	<c:forEach var="music" items="${category.musicList}">
	<tr>
		<td><a href="/MusicSalon/music/${music.id}">${music.title}</a></td>
		<td><!-- <a href="category/${categories.id}">edit</a> --></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="/MusicSalon/music/new"> Add a new Music </a>
</body>
</html>