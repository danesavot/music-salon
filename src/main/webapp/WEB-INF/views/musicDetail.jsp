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
	<table>
	<tr>
		<td>${music.title}</td>
		<td></td>
	</tr>
	<tr>
		<td>${music.singer}</td>
		<td></td>
	</tr>
	<tr>
		<td>${music.composer}</td>
		<td></td>
	</tr>
	<tr>
		<td>${music.writer}</td>
		<td></td>
	</tr>
	<!--
 	<tr>
		<td>${music.album}</td>
		<td></td>
	</tr>
	 -->

	<c:forEach var="category" items="${music.categoryList}">
	<tr>
		<td><a href="category/${category.id}">${category.name}</a></td>
		<td></td>
	</tr>
	</c:forEach>
	</table>
	
<object width="300" height="42">
<param name="src" value="kalimba.mp3">
<param name="autoplay" value="false">
<param name="controller" value="true">
<param name="bgcolor" value="#FFFFFF">
<embed src="kalimba.mp3" autostart="false" loop="false" width="300" height="42" controller="true">
</object>

</body>
</html>