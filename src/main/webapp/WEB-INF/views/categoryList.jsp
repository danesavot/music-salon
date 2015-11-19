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
	<c:forEach var="category" items="${category}">
	<tr>
		<td><a href="categories/${category.id}">${category.name}</a></td>
		<td><!-- <a href="categories/${category.id}">edit</a> --></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="categories/new"> Add a new Category</a>
</body>
</html>