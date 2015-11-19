<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
	<section class="container">
		<spring:url var = "addMember" value="/members/addUser" />
		<form:form  modelAttribute="newMember" action="${addMember}"   >
			<fieldset  style="width: 350px; margin: auto">
								
				<p>
					<label for="firstName"><spring:message code="addmember.fname"></spring:message></label>
					<div>
						<form:input id="firstName" path="firstName"  class="form-control" type="text"/>
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>
				</p>

				<p>
					<label for="lastName"><spring:message code="addmember.lname"></spring:message></label>
					<div>
						<form:input id="lastName" path="lastName"  class="form-control" type="text"/>
						<form:errors path="lastName" cssStyle="color : red;"/>
					</div>
				</p>

				<p>
					<label for="email"><spring:message code="addmember.email"></spring:message></label>
					<div>
						<form:input id="email" path="email"  class="form-control" type="text"/>
						<form:errors path="email" cssStyle="color : red;"/>
					</div>
				</p>
				
				<p>
					<label for="username"><spring:message code="addmember.username"></spring:message></label>
					<div>
						<form:input id="username" path="credentials.username"  class="form-control" type="text"/>
						<form:errors path="credentials.username" cssStyle="color : red;"/>
					</div>
				</p>

				<p>
					<label for="email"><spring:message code="addmember.password"></spring:message></label>
					<div>
						<form:input id="password" path="credentials.password"  class="form-control" type="password"/>
						<form:errors path="credentials.password" cssStyle="color : red;"/>
					</div>
				</p>				 

				<p>
					<input class="btn btn-primary btn-block btn-flat" type="submit" id="btnAdd" value ='<spring:message code="signup" />'/>
				</p>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
