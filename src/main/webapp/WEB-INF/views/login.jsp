<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crema</title>
</head>
<body>
<div class="container">
    <div class="row">
		<div>
    		<div> 
			  	<div>

			    	<form action="<spring:url value="/postLogin"></spring:url>" method="post">
                    <fieldset  style="width:350px; margin: auto">
					  	<c:if test="${not empty error}">
							<div class="alert alert-danger">
								<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
							</div>
						</c:if>                    
                    	<legend><spring:message code="login.login"/></legend>
			    	  	<p>
				    		    <input placeholder="User Name" class ="form-control" name='username' type="text">
			    		</p>
			    		<p>
			    			<input placeholder="Password" class ="form-control" name='password'  type="password" value="">
			    		</p>
			    		<input class="btn btn-primary btn-block btn-flat" type="submit" value='<spring:message code="login"></spring:message>'>
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
</div>
</body>
