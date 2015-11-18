<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Add a Category</title>
</head>
<body>
	<h1>Add a New Category</h1>

	<form:form commandName="category" action="category" method="post">
		<form:errors path="*" cssClass="errorblock" element="div" />
	<table>
		<tr>
			<td>Category Name: </td>
			<td><form:input path="name" /> </td>
			<td><form:errors path="name" cssClass="error" /> </td>
			<td></td>
		</tr>
		<tr>
			<td>Navigation? </td>
			<td><form:checkbox path="navigation" value="true" /> </td>
			<td><form:errors path="navigation" cssClass="error" /> </td>
			<td></td>
		</tr>
	</table>
	<input type="submit"/>
	</form:form>
</body>
</html>