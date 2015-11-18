<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Categories List</title>
</head>
<body>
	<h1>Categories List</h1>
	<table>
	<c:forEach var="categories" items="${category}">
	<tr>
		<td><a href="category/${categories.id}">${categories.name}</a></td>
		<td><!-- <a href="category/${categories.id}">edit</a> --></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="addCategory"> Add a new Category</a>
</body>
</html>