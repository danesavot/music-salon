<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Music Salon</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div>
				<div>
					<div>
						<spring:url var = "newAlbumURL" value="/albums" />
						<form:form modelAttribute="newAlbum" action="${newAlbumURL}"
							method="post" enctype="multipart/form-data">
							<fieldset style="width: 350px; margin: auto">
								<c:if test="${not empty error}">
									<div class="alert alert-danger">
										<form:errors path="*" />
									</div>
								</c:if>
								<legend>
									<spring:message code="newAlbum.legend" />
								</legend>
								
								<p>
									<form:input id="photo" path="photo" type="file" />
								</p>
								
								<p>
									<form:input id="name" placeholder="Name" class="form-control" path="name" type="text" />
									<form:errors path="name" cssStyle="color : red;" />
								</p>
								<p>
								
									<form:input id="publisher" placeholder="Publisher" class="form-control" path="publisher" type="text" />
									<form:errors path="publisher" cssStyle="color : red;" />
								</p>

								<p>
								
									<form:input id="date" placeholder="Date" class="form-control" path="date" type="text" />
									<form:errors path="date" cssStyle="color : red;" />
								</p>

								<input class="btn btn-primary btn-block btn-flat" type="submit"
									value='<spring:message code="newAblum.create"/>'>
							</fieldset>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>