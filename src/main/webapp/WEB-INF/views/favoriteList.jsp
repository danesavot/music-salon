<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Favorite List</title>
</head>
<body>
	<h1>Favorite List</h1>
	<table>
		<c:forEach var="favorite" items="${favoriteList}">
			<tr>
				<td>${favorite.name}</td>
				<c:forEach var="music" items="${favoriteList.musicList}">
					<td><a href="music/${music.id}">Detail</a></td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>

	<a href="/../favourite"> Add new favorite</a>
</body>
</html>