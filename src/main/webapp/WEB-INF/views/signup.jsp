<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<section>
		<div>
			<div class="container">
				<h1>${greeting}</h1>
				<p>${tagline}</p>
				<p>
					<security:authorize access="isAuthenticated()">
  					Welcome  <security:authentication property="principal.username" />
					</security:authorize>
			</div>

			<div class="signup">
				<div style = "float:left">
					<p><img src='<spring:url value="/resources/images/person.svg"/>' height="120px" width="120px"/></p>
					<h3><spring:message code="signup.freelancer" /> </h3>
					
					<p><a href="<spring:url value="/signupMember/freelancer"/>"> 
						<input type="button" id="Cancel" class="" value='<spring:message code="signup" />'/>
					</a></p> 
					
				</div>
				<div style = "float:right">
					<p><img src='<spring:url value="/resources/images/person.svg"/>' height="120px" width="120px"/></p>
					<h3><spring:message code="signup.customer" /></h3>
					
					<p><a href="<spring:url value="/signupMember/customer"/>"> 
						<input type="button" id="Cancel" class="" value='<spring:message code="signup" />'/>
					</a></p> 
					
				</div>				

			</div>
		</div>
	</section>

</body>
</html>
