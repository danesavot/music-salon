<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Add a New Category</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<spring:url var = "newCategoryURL" value="/categories" />
			<form:form modelAttribute="category" action="${newCategoryURL}" method="post">
				<fieldset style="width: 350px; margin: auto">
					<c:if test="${not empty error}">
						<div class="alert alert-danger">
							<form:errors path="*" element="div" />							
						</div>
					</c:if>
					<legend>
						<spring:message code="newCategory.lengend" />
					</legend>

					<p> Category Name: 
						<form:input id="name" placeholder="Name" class="form-control" path="name" type="text" />
						<form:errors path="name" cssStyle="color : red;" />
					</p>
					
					<p> 
						<form:checkbox path="navigation" value="true" /> Navigation?
						<form:errors path="navigation" cssStyle="color : red;" />
					</p>

					<input class="btn btn-primary btn-block btn-flat" type="submit"
						value='<spring:message code="button.create"/>'>

				</fieldset>
			</form:form>		
		</div>
	</div>
</body>
</html>