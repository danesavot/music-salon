<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Add a Music</title>
</head>
<body>
	<h1>Add a New Music</h1>

	<form:form commandName="music" action="music" method="post" enctype="multipart/form-data">
		<form:errors path="*" cssClass="errorblock" element="div" />
		
		<label for="file">Select Music File: </label>
            <input id="file" type="file" name="file" size="30"/><br/>
			<form:errors path="file" cssClass="error" />
			
	<table>
		<tr>
			<td>Title:</td>
			<td><form:input path="title" size="60" /> </td>
			<td><form:errors path="title" cssClass="error" /> </td>
			<td></td>
		</tr>
		<tr>
			<td>Singer:</td>
			<td><form:input path="singer" size="60" /> </td>
			<td><form:errors path="singer" cssClass="error" /> </td>
			<td></td>
		</tr>
		<tr>
			<td>Composer:</td>
			<td><form:input path="composer" size="60" /> </td>
			<td><form:errors path="composer" cssClass="error" /> </td>
			<td></td>
		</tr>
		<tr>
			<td>Writer:</td>
			<td><form:input path="writer" size="60" /> </td>
			<td><form:errors path="writer" cssClass="error" /> </td>
			<td></td>
		</tr>
		<tr>
			<td>Album:</td>
 <td>
			<!--
<select name="albumList">
  <c:forEach items="${albumList}" var="album">
    <option value="${album}">
        ${album.name}
    </option>
  </c:forEach>
</select>
  -->
 </td>			
 <td><form:errors path="album" cssClass="error" /> </td>
 <td><a href="addAlbum"> Add a new Album</a></td>
 
		</tr>
		
		<tr>
		<!-- to be update to album style -->
			<td>Category:</td>
<td>
<select name="categoryList">
  <c:forEach items="${categoryList}" var="category">
    <option value="${category}">
        ${category.name}
    </option>
  </c:forEach>
</select>
</td>
			<td><form:errors path="categoryList" cssClass="error" /> </td>
 <td><a href="addCategory"> Add a new Category</a></td>
		</tr>
	</table>
	<input type="submit" value="Add Music" />
	</form:form>
</body>
</html>