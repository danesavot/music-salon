<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Add Music</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<spring:url var = "newMusicURL" value="/music" />
			<form:form modelAttribute="music" action="${newMusicURL}" method="post" enctype="multipart/form-data">
				<fieldset style="width: 350px; margin: auto">
					<c:if test="${not empty error}">
						<div class="alert alert-danger">
							<form:errors path="*" element="div" />							
						</div>
					</c:if>
					<legend>
						<spring:message code="newMusic.lengend" />
					</legend>

		<label for="file">Select Music File: </label>
            <form:input id="file" type="file" path="file" size="30"/><br/>
			<form:errors path="file" cssClass="error" />
			
					<p> Title: 
						<form:input id="title" placeholder="Title" class="form-control" path="title" type="text" />
						<form:errors path="title" cssStyle="color : red;" />
					</p>
					<p> Singer: 
						<form:input id="singer" placeholder="Singer" class="form-control" path="singer" type="text" />
						<form:errors path="singer" cssStyle="color : red;" />
					</p>
					<p> Composer: 
						<form:input id="composer" placeholder="Composer" class="form-control" path="composer" type="text" />
						<form:errors path="composer" cssStyle="color : red;" />
					</p>
					<p> Writer: 
						<form:input id="writer" placeholder="Writer" class="form-control" path="writer" type="text" />
						<form:errors path="writer" cssStyle="color : red;" />
					</p>
					
<p> 
	Album:
	<form:select path="album.id" items="${albumList}" class="form-control" itemValue="id" itemLabel="name" />
	<a href="../albums/new"> Add a new Album</a>	
	<form:errors path="album" cssStyle="color : red;" />
</p>

<p>
	Category:
	
	<form:select path="categoryList" multiple="true" class="form-control" size="2" items="${categoryList}" itemValue="id" itemLabel="name" />
	<a href="../categories/new"> Add a new Category</a>
	<form:errors path="categoryList" cssStyle="color : red;" />
</p>

					<input class="btn btn-primary btn-block btn-flat" type="submit"
						value='<spring:message code="button.create"/>'>

				</fieldset>
			</form:form>		
		</div>
	</div>

</body>
</html>