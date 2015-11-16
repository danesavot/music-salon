<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container"> 
				<h1> <spring:message code="welcome.greeting"></spring:message> </h1>
				<p> <spring:message code="welcome.tagline"></spring:message> </p>
				<p> <security:authorize access="isAuthenticated()">
  					 <spring:message code="welcome.welcome"></spring:message> <security:authentication property="principal.username" />
				</security:authorize>

			</div>	 
 
				  <div class="container">
 				  <security:authorize access="isAnonymous()">
 				  <!-- WHICH ONE? depends on basic form OR CUSTOM -->
				</security:authorize>

		 
				</div>	
	 			<div class="pull-left"> <h3><spring:message code="welcome.SpecialBlurb"></spring:message></h3> </div>
		</div>	
	</section>
	
</body>
</html>
